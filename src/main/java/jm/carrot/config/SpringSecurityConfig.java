package jm.carrot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.formLogin()
        .loginPage("/login-page") // 설정안하면 스프링디폴트 로그인페이지 호출됨. /login
        .loginProcessingUrl("/login-process") // 로그인인증필터
        .defaultSuccessUrl("/main") // 성공했을 때 이동 페이지
        .successHandler(new CustomAuthenticationSuccessHandler("/main")) // 인증성공 후 필요한 핸들러등록
        .failureUrl("login-fail") // 로그인 실패시 이동페이지
        .failureHandler(new CustomAuthenticationFailureHandler("/login-fail")) //실패시 커스텀 핸들러 등록
        .permitAll()
    ;
  }


  @Bean
  public AuthenticationSuccessHandler CustomAuthenticationSuccessHandler(){
    return new CustomAuthSuccessHandler();
  }
}
