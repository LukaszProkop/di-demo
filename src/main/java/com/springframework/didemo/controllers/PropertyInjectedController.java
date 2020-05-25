package com.springframework.didemo.controllers;

import com.springframework.didemo.services.GreetingServiceImpl;

/**
 *  Bad Class example
 */
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
