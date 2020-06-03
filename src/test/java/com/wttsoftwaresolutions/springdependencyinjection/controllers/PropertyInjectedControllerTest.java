package com.wttsoftwaresolutions.springdependencyinjection.controllers;

import com.wttsoftwaresolutions.springdependencyinjection.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @Before
    void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
    }
}