package com.springframework.study.services;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang){
            case "de" :
                return  new PrimaryGermanGreetingService(greetingRepository);
            case "se" :
                return  new PrimarySpanishGreetingService(greetingRepository);
            default:
                return  new PrimaryGreetingService(greetingRepository);
        }
    }
}
