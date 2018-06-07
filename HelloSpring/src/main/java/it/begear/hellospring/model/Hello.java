package it.begear.hellospring.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {
	
	private HelloWorld hello;
	
	@Autowired
	public void setHello(HelloWorld hello) {
		this.hello = hello;
	}
	
	public HelloWorld getHello() {
		return hello;
	}

	@Override
	public String toString() {
		return "Hello [helloAuto=" + hello.toString() + "]";
	}
	
	
	

}
