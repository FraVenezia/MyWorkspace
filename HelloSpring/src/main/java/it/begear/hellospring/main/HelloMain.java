package it.begear.hellospring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.begear.hellospring.model.Hello;

public class HelloMain {
//	@Autowired
//	Hello obj;

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
				Hello obj = (Hello) context.getBean("hello");
		System.out.println(obj);

	}
	
}
