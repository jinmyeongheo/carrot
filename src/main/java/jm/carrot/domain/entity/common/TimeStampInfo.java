package jm.carrot.domain.entity.common;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class TimeStampInfo {
    // 등록시간
    private LocalDateTime regDate;

    // 등록유저
    private String regId;

    // 수정시간
    private LocalDateTime modifyDate;

    // 수정
    private String modifyId;

}
