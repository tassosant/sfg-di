package guru.springframework.sgfdi;

import guru.springframework.sgfdi.controllers.ConstructorInjectedController;
import guru.springframework.sgfdi.controllers.MyController;
import guru.springframework.sgfdi.controllers.PropertyInjectedController;
import guru.springframework.sgfdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SgfDiApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SgfDiApplication.class, args);
		ApplicationContext context = SpringApplication.run(SgfDiApplication.class, args);
		MyController myController = (MyController) context.getBean("myController");

		System.out.println("----------Primary Bean");
		System.out.println(myController.sayHello());
		//if we delete qualifier in one of the controllers, primary service will be injected to the controller without the primary annotation
		System.out.println("------Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----------Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(
				setterInjectedController.getGreeting()
		);

		System.out.println("-----------Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
