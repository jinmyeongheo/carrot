package jm.carrot.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mobileNumber;

    /** 활성화 상태 */
    private Boolean activated;

    private String ratingScore;
    @CreatedDate
    private LocalDateTime createTime;

    @Builder
    public User(Long id, String mobileNumber, Boolean activated, String ratingScore, LocalDateTime createTime) {
        this.id = id;
        this.mobileNumber = mobileNumber;
        this.activated = activated;
        this.ratingScore = ratingScore;
        this.createTime = createTime;
    }

}
