package com.springframework.didemo.controllers;

import com.springframework.didemo.services.GreetingService;

/**
 *  Bad Class example
 */
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
