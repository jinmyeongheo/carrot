package jm.carrot.config.security;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.RequestMatcher;

public class CustomAuthenticationProcessingFilter extends AbstractAuthenticationProcessingFilter {
  // 인증처리 담당
  public CustomAuthenticationProcessingFilter(
      RequestMatcher requiresAuthenticationRequestMatcher,
      AuthenticationManager authenticationManager) {
    super(requiresAuthenticationRequestMatcher, authenticationManager);
  }

  @Override
  public Authentication attemptAuthentication(HttpServletRequest request,
      HttpServletResponse response) throws AuthenticationException, IOException, ServletException {

    String id = request.getParameter("id");
    String pw = request.getParameter("pw");

    //예외로직 필수~!!!

    // 실제 인증처리를 수행하는 매니저를 호출함.
    Authentication authenticate = getAuthenticationManager().authenticate(
        new UsernamePasswordAuthenticationToken(id, pw));
    return authenticate;
  }
}
