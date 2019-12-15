package com.springframework.study.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO_GURUS = "Hello Gurus!!!";
    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
