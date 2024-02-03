package jm.carrot.config;

import java.util.ArrayList;
import jm.carrot.domain.entity.User.User;
import jm.carrot.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginUserDetailServiceImpl implements UserDetailsService {

  private final UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    User byEmail = userRepository.findByEmail(email);
    ArrayList<GrantedAuthority> grantedAuthorityList = new ArrayList<GrantedAuthority>();

    LoginUser loginUser = new LoginUser("id"
        , "loginID"
        , "pw"
        , byEmail.getEmail()
        , true
        , false
        , "nickname"
        , grantedAuthorityList);
    return loginUser;
  }
}
