package com.wttsoftwaresolutions.springdependencyinjection.config;

import com.wttsoftwaresolutions.springdependencyinjection.services.GreetingServiceFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository) {
        return new GreetingServiceFactory(repository);
    }
}
