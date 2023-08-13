package jm.carrot.service;

import jm.carrot.dao.merchant.MerchantRepository;
import jm.carrot.dao.order.deliveryAgency.DeliveryAgency;
import jm.carrot.dao.order.deliveryAgency.DeliveryAgencyRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class DeliveryAgencyServiceTest {

    @Autowired DeliveryAgencyService deliveryAgencyService;
    @Autowired
    MerchantRepository merchantRepository;
    @Autowired
    DeliveryAgencyRepository deliveryAgencyRepository;

    @Test
    void test(){
        DeliveryAgency.builder().name("첫배달대행").build();

    }
}