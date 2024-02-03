package jm.carrot.config;

import java.util.Collection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
@Getter
@AllArgsConstructor
public class LoginUser implements UserDetails {

  private String id;    // DB에서 PK 값
  private String loginId;        // 로그인용 ID 값
  private String password;    // 비밀번호
  private String email;    //이메일
  private boolean emailVerified;    //이메일 인증 여부
  private boolean locked;    //계정 잠김 여부
  private String nickname;    //닉네임
  private Collection<GrantedAuthority> authorities;    //권한 목록

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    // 계정의 권한 목록 리턴
    return authorities;
  }

  @Override
  public String getPassword() {
    // 비밀번호 리턴
    return password;
  }

  @Override
  public String getUsername() {
    // 계정의 고유한 값 리턴. Ex) pk, 이메일
    return id;
  }

  @Override
  public boolean isAccountNonExpired() {
    // 계정의 만료 여부리턴
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    // 계정 잠금여부
    return locked;
  }

  @Override
  public boolean isCredentialsNonExpired() {

    // 비밀번호 만료여부
    return true;
  }

  @Override
  public boolean isEnabled() {
    // 계정의 활성화 여부.
    return emailVerified && !locked;
  }
}
