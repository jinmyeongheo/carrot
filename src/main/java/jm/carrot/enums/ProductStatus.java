package jm.carrot.enums;

import lombok.Getter;

@Getter
public enum ProductStatus {
    NEW("0", "새상품"),
    RESERVED("1", "예약중"),
    SOLD_OUT("2", "판매완료");

    private String code;
    private String name;

    ProductStatus(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
