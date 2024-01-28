package jm.carrot.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String getName() {
        return "hi";
    }
}
