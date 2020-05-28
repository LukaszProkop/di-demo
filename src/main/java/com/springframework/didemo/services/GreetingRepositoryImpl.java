package com.springframework.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getPolishGreeting() {
        return "Cześć - prioretytowy serwis witający";
    }

    @Override
    public String getGermanGreeting() {
        return "Primärer Grußdienst";
    }
}
