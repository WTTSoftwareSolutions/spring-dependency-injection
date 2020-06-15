package com.wttsoftwaresolutions.springdependencyinjection;

import com.wttsoftwaresolutions.springdependencyinjection.controllers.ConstructorInjectedController;
import com.wttsoftwaresolutions.springdependencyinjection.controllers.GetterInjectedController;
import com.wttsoftwaresolutions.springdependencyinjection.controllers.MyController;
import com.wttsoftwaresolutions.springdependencyinjection.controllers.PropertyInjectedController;
import com.wttsoftwaresolutions.springdependencyinjection.examplebeans.FakeDataSource;
import com.wttsoftwaresolutions.springdependencyinjection.examplebeans.FakeJmsBroker;
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

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());

		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUsername());

	}

}
