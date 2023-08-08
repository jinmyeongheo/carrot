package jm.carrot.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum UserType implements LegacyEnum {
    /** 관리자 */
    MANAGER("0"),
    /** 일반사용자 */
    GENERAL_USER("1"),
    /** 영업사원 */
    SALES_PERSON("2");

    @Getter
    private final String code;

    public static UserType of(String code) {
        return LegacyEnum.of(values(), code);
    }
}
