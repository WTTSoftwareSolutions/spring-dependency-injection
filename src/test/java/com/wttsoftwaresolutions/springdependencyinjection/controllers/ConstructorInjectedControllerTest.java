package com.wttsoftwaresolutions.springdependencyinjection.controllers;

import com.wttsoftwaresolutions.springdependencyinjection.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @Before
    void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
    }
}