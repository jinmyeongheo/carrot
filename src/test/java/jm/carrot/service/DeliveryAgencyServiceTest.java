package jm.carrot.service;

import jm.carrot.domain.entity.order.deliveryAgency.DeliveryAgency;
import jm.carrot.domain.entity.order.deliveryAgency.DeliveryAgencyRepository;
import jm.carrot.domain.repository.MerchantRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class DeliveryAgencyServiceTest {

    @Autowired
    MerchantRepository merchantRepository;
    @Autowired
    DeliveryAgencyRepository deliveryAgencyRepository;

    @Test
    void test(){
        DeliveryAgency.builder().name("첫배달대행").build();

    }
}