package com.wttsoftwaresolutions.springdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */
@Profile({"FR", "default"})
@Service("i18nService")
public class I18nFrenchGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Bonjour, Le Monde - FR";
    }
}
