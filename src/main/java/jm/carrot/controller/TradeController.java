package jm.carrot.controller;

import jm.carrot.dao.merchant.MerchantRepository;
import jm.carrot.dao.order.deliveryAgency.DeliveryAgency;
import jm.carrot.dao.order.deliveryAgency.DeliveryAgencyRepository;
import jm.carrot.service.DeliveryAgencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class TradeController {
    // 주석추가
    private final DeliveryAgencyService deliveryAgencyService;
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
        deliveryAgencyService.registerDeliveryAgency(list, 1L);

        return "성공";

    }

    // 검색조건 selectBox
    // 검색 리스트요약
    // 검색 리스트
}
