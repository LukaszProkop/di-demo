package com.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_SPRING = "Hello Spring!!!! - Orginal";

    @Override
    public String sayGreeting() {
        return HELLO_SPRING;
    }
}
