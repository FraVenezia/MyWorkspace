package com.mkyong.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		
		Customer cust=(Customer) context.getBean("customer");
		
		System.out.println(cust);
		
//		Anagrafica anagrafica= (Anagrafica) context.getBean("anagrafica");
//		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
//		
//		obj.printHello();
		
		
		
		
	}

}