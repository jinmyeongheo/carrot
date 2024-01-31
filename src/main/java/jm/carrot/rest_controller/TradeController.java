package jm.carrot.rest_controller;

import jm.carrot.domain.entity.merchant.Merchant;
import jm.carrot.domain.entity.order.deliveryAgency.DeliveryAgencyRepository;
import jm.carrot.domain.repository.MerchantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class TradeController {
    private final MerchantRepository merchantRepository;
    private final DeliveryAgencyRepository deliveryAgencyRepository;

    @GetMapping("/test/123")
    public String test(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        Merchant byId = merchantRepository.findById(1L);
        return "성공";

    }

    // 검색조건 selectBox
    // 검색 리스트요약
    // 검색 리스트
}
