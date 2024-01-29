package jm.carrot.domain.entity.User;

import jm.carrot.converter.BooleanToYnConverter;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //이메일
    private String email;

    private String password;

    private String name;

    private String tel;

    private LocalDate birthday;

    @Convert(converter = BooleanToYnConverter.class)
    private boolean deleted;

}
