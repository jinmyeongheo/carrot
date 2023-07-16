package jm.carrot.entity.base_entity;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class TimeEntity {

    private String createdBy;

    private LocalDateTime createDate;

    private String lastModifiedBy;

    private LocalDateTime lastModifiedDate;
}
