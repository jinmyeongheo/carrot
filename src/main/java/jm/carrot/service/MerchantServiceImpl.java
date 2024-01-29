package jm.carrot.service;

import jm.carrot.domain.entity.merchant.Merchant;
import jm.carrot.domain.repository.MerchantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MerchantServiceImpl implements MerchantService{

  private final MerchantRepository merchantRepository;

  @Override
  public Merchant getMerchant(Long id) {
    return merchantRepository.findById(id);
  }
}
