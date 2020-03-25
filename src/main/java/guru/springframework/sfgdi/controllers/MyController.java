package guru.springframework.sfgdi.controllers;


import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Say Hello Wotrld!");

     return "Hello World";
    }
}
