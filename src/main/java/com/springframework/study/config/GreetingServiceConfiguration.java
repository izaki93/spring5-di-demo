package com.springframework.study.config;

import com.springframework.study.services.GreetingRepository;
import com.springframework.study.services.GreetingService;
import com.springframework.study.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfiguration {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile("en")
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("en");
     }

    @Bean
    @Primary
    @Profile("de")
    GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("de");
    }

    @Bean
    @Primary
    @Profile("se")
    GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("se");
    }
}
