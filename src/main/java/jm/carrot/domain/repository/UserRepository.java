package jm.carrot.domain.repository;

import jm.carrot.domain.entity.User.User;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<User,Long> {

  User findByEmail(String email);

}
