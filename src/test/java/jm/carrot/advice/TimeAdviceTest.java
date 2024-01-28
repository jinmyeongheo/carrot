package jm.carrot.advice;

import jm.carrot.service.TestServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.aop.framework.ProxyFactory;

class TimeAdviceTest {

    @Test
    void testN() {
        TestServiceImpl testService = new TestServiceImpl();
        ProxyFactory proxyFactory = new ProxyFactory(testService);
        proxyFactory.addAdvice(new TimeAdvice());
    }

}