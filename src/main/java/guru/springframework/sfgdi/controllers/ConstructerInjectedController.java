package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructerInjectedController {

    private final GreetingService service;

    public ConstructerInjectedController(@Qualifier("constructerGreetingService") GreetingService service) {
        this.service = service;
    }

    public String getGreeting(){
        return service.sayGreeting();
    }
}
