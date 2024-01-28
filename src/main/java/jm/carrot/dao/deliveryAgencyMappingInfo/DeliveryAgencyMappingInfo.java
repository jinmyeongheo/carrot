package jm.carrot.dao.deliveryAgencyMappingInfo;

import jm.carrot.dao.merchant.Merchant;
import jm.carrot.dao.order.deliveryAgency.DeliveryAgency;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class DeliveryAgencyMappingInfo {

    // 배달대행사 매핑 아이디
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Merchant merchant;

    @ManyToOne(fetch = FetchType.LAZY)
    private DeliveryAgency deliveryAgency;

    @Builder

    public DeliveryAgencyMappingInfo(  Merchant merchant, DeliveryAgency deliveryAgency) {
        this.merchant = merchant;
        this.deliveryAgency = deliveryAgency;
    }
}
