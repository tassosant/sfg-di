package guru.springframework.sgfdi;

import guru.springframework.sgfdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SgfDiApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SgfDiApplication.class, args);
		ApplicationContext context = SpringApplication.run(SgfDiApplication.class, args);
		MyController myController = (MyController) context.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
