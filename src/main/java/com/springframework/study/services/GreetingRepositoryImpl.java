package com.springframework.study.services;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {
        return "Primärer Grußdienst";
    }
}
