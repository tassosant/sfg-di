package guru.springframework.sgfdi;

import guru.springframework.sgfdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"guru.springframework.sgfdi","com.springframework.pets"})
@SpringBootApplication
public class SgfDiApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SgfDiApplication.class, args);
		ApplicationContext context = SpringApplication.run(SgfDiApplication.class, args);

		PetController petController = context.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());


		I18nController i18nController = (I18nController)  context.getBean("i18nController");
		//in application.properties write the line spring.profiles.active=ES or spring.profiles.active=EN so the spring will recognize which bean to load into the context
		System.out.println(i18nController.sayHello());




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
