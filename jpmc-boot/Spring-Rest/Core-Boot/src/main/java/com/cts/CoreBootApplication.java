package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CoreBootApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(CoreBootApplication.class, args);

		ac.getBean(Test.class).f1();
		ac.getBean(Student.class).getDept().testDept();

	}

}
