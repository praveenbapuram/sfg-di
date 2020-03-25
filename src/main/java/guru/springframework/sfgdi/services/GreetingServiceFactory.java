package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.services.*;

public class GreetingServiceFactory {
    private GreetingRepository repository;

    public GreetingServiceFactory(GreetingRepository repository) {
        this.repository = repository;
    }

    public GreetingService createGreetingService(String lang){
        switch (lang){
            case "en":  return new PrimaryGreetingService(repository);
            case "de":  return new PrimaryGermanGreetingService(repository);
            case "es":  return new PrimarySpanishGreetingService(repository);
            default :  return new PrimaryGreetingService(repository);
        }
    }
}
