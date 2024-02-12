package guru.springframework.sgfdi2;

import guru.springframework.sgfdi2.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SgfDi2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SgfDi2Application.class, args);

		System.out.println("---- Spring Profiles");

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");

		System.out.println(i18nController.sayHello());

		System.out.println("----- primary bean");

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println(myController.sayHello());

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
