package com.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
//		System.out.println("Hello World!"); 1
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
//		Dev obj = context.getBean(Dev.class); // 2 (Here i have given the specific class name of the class present in the bean factory)
		Dev obj = (Dev) context.getBean("dev"); // (Here i have given the bean the bean that is to be used which is present in the bean factory) BOTH METHOD WILL WORK.
		obj.build();
	}
}
