package jm.carrot.config.security;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

public class CustomAuthenticationFailureHandler implements AuthenticationFailureHandler {
  private String defaultFailureUrl = "/";
  public CustomAuthenticationFailureHandler(String defaultFailureUrl) {
    this.defaultFailureUrl = defaultFailureUrl;
  }

  @Override
  public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
      AuthenticationException exception) throws IOException, ServletException {
    // 실패로그를 남긴다.
    // 실패이벤트 발송
    response.sendRedirect(defaultFailureUrl);
  }
}
