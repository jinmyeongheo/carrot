package jm.carrot.domain.entity.order.deliveryAgency;

import jm.carrot.converter.BooleanToYnConverter;
import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class DeliveryAgency{

    // 배달대행사 아이디
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    // 배달대행사 이름
    @Column(name = "name")
    private String name;

    // 삭제여부
    @Column(name = "delYn")
    @Convert(converter = BooleanToYnConverter.class)
    private Boolean delYn;

    @Builder
    public DeliveryAgency(String name) {
        this.name = name;
        this.delYn = false;
    }
}
