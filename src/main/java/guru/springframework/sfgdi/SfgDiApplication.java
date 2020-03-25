package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {


		ApplicationContext context=	SpringApplication.run(SfgDiApplication.class, args);
		MyController myController= (MyController) context.getBean("myController");
		System.out.println(myController.sayHello());

		PropertyInjectingController controller= (PropertyInjectingController) context.getBean("propertyInjectingController");
		System.out.println(controller.getGreeting());

		SetterBasedController setterBasedController= (SetterBasedController) context.getBean("setterBasedController");
		System.out.println(setterBasedController.getGreeting());

		ConstructerInjectedController constructerInjectedController= (ConstructerInjectedController) context.getBean("constructerInjectedController");
		System.out.println(constructerInjectedController.getGreeting());

		PrimaryController primarynjectedController= (PrimaryController) context.getBean("primaryController");
		System.out.println(primarynjectedController.getGreeting());

		I18NController i18NController= (I18NController) context.getBean("i18NController");
		System.out.println(i18NController.sayHello());
	}

}
