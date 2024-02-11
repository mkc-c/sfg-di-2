package guru.springframework.sgfdi2;

import guru.springframework.sgfdi2.controllers.ConstuctorInjectedController;
import guru.springframework.sgfdi2.controllers.MyController;
import guru.springframework.sgfdi2.controllers.PropertyInjectedContoller;
import guru.springframework.sgfdi2.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SgfDi2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SgfDi2Application.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);


		System.out.println("----- property");

		PropertyInjectedContoller propertyInjectedContoller = (PropertyInjectedContoller) ctx.getBean("propertyInjectedContoller");

		System.out.println(propertyInjectedContoller.getGreeting());

		System.out.println("----- setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----- constructor");

		ConstuctorInjectedController constuctorInjectedController = (ConstuctorInjectedController) ctx.getBean("constuctorInjectedController");

		System.out.println(constuctorInjectedController.getGreeting());
	}

}
