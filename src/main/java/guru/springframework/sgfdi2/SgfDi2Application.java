package guru.springframework.sgfdi2;

import guru.springframework.sgfdi2.controllers.MyController;
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
	}

}
