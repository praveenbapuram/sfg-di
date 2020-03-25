package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructerGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructerInjectedControllerTest {

    ConstructerInjectedController controller;

    @BeforeEach
    void setUp() {
        controller=new ConstructerInjectedController(new ConstructerGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}