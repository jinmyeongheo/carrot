package jm.carrot.entity;

import jm.carrot.converter.ProductStatusConverter;
import jm.carrot.entity.base_entity.TimeEntity;
import jm.carrot.enums.ProductStatus;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product extends TimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User user;

    /*
     * 상품 상태
     * */
    @Convert(converter = ProductStatusConverter.class)
    private ProductStatus productStatus;
    // 상품제목
    private String title;

    // 상품제목
    private String sellPrice;

    // 상품제목
    private String viewCount;

    // 상품제목

    private String description;

    // 상품제목

    private LocalDateTime refreshedAt;

}
