package jm.carrot.converter;

import jm.carrot.enums.ProductStatus;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Arrays;
@Converter
public class ProductStatusConverter implements AttributeConverter<ProductStatus, String> {
    @Override
    public String convertToDatabaseColumn(ProductStatus attribute) {
        return attribute.getCode();
    }

    @Override
    public ProductStatus convertToEntityAttribute(String dbData) {
        return Arrays.stream(ProductStatus.values())
                .filter( v -> v.getCode().equals(dbData))
                .findAny()
                .orElseThrow();
    }
}
