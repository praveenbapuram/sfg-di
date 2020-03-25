package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructerGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterBasedControllerTest {

    SetterBasedController controller;
    @BeforeEach
    void setUp() {
        controller=new SetterBasedController();
        controller.setService(new ConstructerGreetingService());
    }

    @Test
    void getService() {

        System.out.println(controller.getGreeting());
    }
}