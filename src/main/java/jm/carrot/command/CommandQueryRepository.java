package jm.carrot.command;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class CommandQueryRepository {
    private final JPAQueryFactory jpaQueryFactory;

    /** 커맨드 쿼리 따로 생성*/
//    public List<User> findByUsers(String name){
//        System.out.println("name = " + name);
//        return jpaQueryFactory.selectFrom(user).fetch();
//    }
}
