package jm.carrot.enums;

public interface LegacyEnum {
    String getCode();

    static <E extends Enum<E> & LegacyEnum> E of(E[] values, String code) {
        for (E e : values) {
            if (e.getCode().equals(code)) {
                return e;
            }
        }
        return null;
    }
}
