package com.wttsoftwaresolutions.dependencyinjection.services;

import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */
@Service
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}