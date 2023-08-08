package jm.carrot.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum OrderState implements LegacyEnum{
    // 취소
    CANCEL("08"),
    // 부분취소
    PARTIAL_CANCEL("09"),
    // 결제완료
    PAY_FINISHED("11");

    private final String code;

    public static OrderState of(String code) {
        return LegacyEnum.of(values(), code);
    }

}
