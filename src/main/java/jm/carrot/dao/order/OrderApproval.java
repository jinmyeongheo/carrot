package jm.carrot.dao.order;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class OrderApproval {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "orderSeq")
    private String seq;
    // 승인타입, 승인일시, 승인번호, 취소번호,취소내용

}
