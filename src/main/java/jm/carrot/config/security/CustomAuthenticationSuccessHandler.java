package jm.carrot.config.security;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
  private String defaultSuccessUrl = "/";

  public CustomAuthenticationSuccessHandler(String defaultSuccessUrl) {
    this.defaultSuccessUrl = defaultSuccessUrl;
  }

  @Override
  public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
      Authentication authentication) throws IOException, ServletException {
    // 성공후 로그를 ㅇ남긴다.
    //성공 이벤트를 발생한다.
    // 이메일을 발송한다
    response.sendRedirect(defaultSuccessUrl);

  }
}
