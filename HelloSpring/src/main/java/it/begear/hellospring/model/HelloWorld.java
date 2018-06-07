package it.begear.hellospring.model;

public class HelloWorld {
	private String message;

	public void setMessage(String message){
		this.message  = message;
	}

	@Override
	public String toString() {
		return "HelloWorld [message=" + message + "]";
	}

}
