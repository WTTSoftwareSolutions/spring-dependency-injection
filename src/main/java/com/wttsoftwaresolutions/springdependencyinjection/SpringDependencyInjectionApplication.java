package com.wttsoftwaresolutions.springdependencyinjection;

import com.wttsoftwaresolutions.springdependencyinjection.controllers.ConstructorInjectedController;
import com.wttsoftwaresolutions.springdependencyinjection.controllers.GetterInjectedController;
import com.wttsoftwaresolutions.springdependencyinjection.controllers.MyController;
import com.wttsoftwaresolutions.springdependencyinjection.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println("------- Primary Bean");
		System.out.println(controller.hello());
		System.out.println("------ Property");
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println("--------- Getter");
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println("-------- Constructor");
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

	}

}
