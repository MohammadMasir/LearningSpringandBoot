package com.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
//		System.out.println("Hello World!"); 1
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
//		Dev obj = context.getBean(Dev.class); 2
//		obj.build();
	}
}
