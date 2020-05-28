package com.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class PrimaryPolishGreetingService implements GreetingService {

    GreetingRepository greetingRepository;

    public PrimaryPolishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getPolishGreeting();
    }
}
