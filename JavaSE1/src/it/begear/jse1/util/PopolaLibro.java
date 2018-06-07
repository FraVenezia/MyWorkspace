package it.begear.jse1.util;

import it.begear.jse1.model.Libro;

public final class PopolaLibro 
{
	public static Libro[] inserimentoLibro(Libro[] libreria)
	{
		libreria[0]=new Libro("Il codice da Vinci","Dan Brown","Mondadori","8804555456");	
		libreria[1]=new Libro("Inferno","Dan Brown","Mondadori","8804555345");
		return libreria;
	}
}
