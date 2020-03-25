package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterBasedController {
    private GreetingService service;


    public GreetingService getService() {
        return service;
    }


    @Autowired
    @Qualifier("setterInjectedGreetingService")
    public void setService(GreetingService service) {
        this.service = service;
    }

    public String getGreeting(){
       return service.sayGreeting();
    }
}
