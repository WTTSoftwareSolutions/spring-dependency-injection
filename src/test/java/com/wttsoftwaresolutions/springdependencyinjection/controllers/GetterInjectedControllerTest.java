package com.wttsoftwaresolutions.springdependencyinjection.controllers;

import com.wttsoftwaresolutions.springdependencyinjection.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class GetterInjectedControllerTest {

    GetterInjectedController getterInjectedController;

    @Before
    void setUp() throws Exception {
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, getterInjectedController.sayHello());
    }
}