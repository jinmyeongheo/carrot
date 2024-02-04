package jm.carrot.config.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

@RequiredArgsConstructor
public class CustomAuthenticationManager implements AuthenticationManager {

  private UserDetailsService userDetailsService;

  // 여러개의 provider를 드
  @Override
  public Authentication authenticate(Authentication authentication) throws AuthenticationException {
    LoginUser loginUser = (LoginUser) authentication.getPrincipal();



    // 비번일치, 회원 존재, 적절한 예외처리!!

    //provider 를 호출
    UserDetails userDetails = userDetailsService.loadUserByUsername(loginUser.getEmail());
    return new UsernamePasswordAuthenticationToken(userDetails.getUsername(),
        userDetails.getPassword(), userDetails.getAuthorities());
  }
}
