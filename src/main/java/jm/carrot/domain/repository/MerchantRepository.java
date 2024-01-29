package jm.carrot.domain.repository;

import jm.carrot.domain.entity.merchant.Merchant;
import org.springframework.data.repository.Repository;

public interface MerchantRepository extends Repository<Merchant, Long> {
  /* jpaRepository를 왜 안써유?
  * 1. 단위테스트 가짜 구현 만들기어려움. -> 안쓰는 메서드가 너무남ㅎ어
  * 2. CQRS에 맞지않음
  * 3. Repository를 상속하고 필요한 메서드만 추가!
  * */
  Merchant findById(Long id);
}
