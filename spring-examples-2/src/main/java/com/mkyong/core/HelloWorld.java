package com.mkyong.core;

public class HelloWorld {
	private Anagrafica anagrafica;

	public HelloWorld(Anagrafica anagrafica) {
		this.anagrafica=anagrafica;
	}
	public void printHello() {
		System.out.println("Spring 3 : Hello " + anagrafica.getNome() +" "+ anagrafica.getCognome());
	}

}
