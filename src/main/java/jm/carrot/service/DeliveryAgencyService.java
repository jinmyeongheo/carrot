package jm.carrot.service;

import jm.carrot.dao.deliveryAgencyMappingInfo.DeliveryAgencyMappingInfo;
import jm.carrot.dao.deliveryAgencyMappingInfo.DeliveryAgencyMappingInfoRepository;
import jm.carrot.dao.merchant.Merchant;
import jm.carrot.dao.merchant.MerchantRepository;
import jm.carrot.dao.order.deliveryAgency.DeliveryAgency;
import jm.carrot.dao.order.deliveryAgency.DeliveryAgencyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DeliveryAgencyService {

    private final DeliveryAgencyMappingInfoRepository deliveryAgencyMappingInfoRepository;
    private final MerchantRepository merchantRepository;
    private final DeliveryAgencyRepository deliveryAgencyRepository;

    public void registerDeliveryAgency(List<String> deliveryAgencyIdList, Long merchantId){

        Merchant merchant = merchantRepository.getReferenceById(merchantId);
        List<DeliveryAgencyMappingInfo> deliveryAgencyMappingInfos = new ArrayList<>();


        deliveryAgencyIdList.forEach( id ->{
            // 7번 select
            DeliveryAgency deliveryAgency = deliveryAgencyRepository.getReferenceById(Long.parseLong(id));
            DeliveryAgencyMappingInfo build = DeliveryAgencyMappingInfo.builder()
                    .deliveryAgency(deliveryAgency)
                    .merchant(merchant)
                    .build();
            // 7번 insert 이게 맞나..?
            deliveryAgencyMappingInfos.add(build);
        });

        deliveryAgencyMappingInfoRepository.saveAll(deliveryAgencyMappingInfos);
    }
}
