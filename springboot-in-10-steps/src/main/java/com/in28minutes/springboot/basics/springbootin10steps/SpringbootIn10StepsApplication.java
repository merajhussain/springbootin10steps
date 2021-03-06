package com.in28minutes.springboot.basics.springbootin10steps;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootIn10StepsApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext context = SpringApplication.run(SpringbootIn10StepsApplication.class, args);
	 

		for(String s : context.getBeanDefinitionNames())
		{
			System.out.println(s);
		}
	}

}
