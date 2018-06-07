package it.begear.jse1.model;

import it.begear.jse1.util.PopolaLibro;

public class Libro extends Media
{
	private int numPag;
	private String casaEditrice;
	private String edizione;
	private String isbn;
	private Libro[] libreria=new Libro[2];
	
	public Libro(String titolo,String autore ,String casaEditrice,String isbn) 
	{
		super(titolo,autore);
		this.casaEditrice=casaEditrice;
		this.isbn=isbn;
	}
	
	public void setNumPag(int numPag) {this.numPag=numPag;}
	public void setCasaEditrice(String casaEditrice) {this.casaEditrice=casaEditrice;}
	public void setEdizione(String edizione) {this.edizione=edizione;}
	public void setIsbn(String isbn) {this.isbn=isbn;}
	public void setLibreria() {this.libreria = PopolaLibro.inserimentoLibro(libreria);}

	public int getNumPag() {return numPag;}
	public String getCasaEditrice() {return casaEditrice;}
	public String getEdizioni() {return edizione;}
	public String getIsbn() {return isbn;}
	public Libro[] getLibreria() {return libreria;}
	
	@Override
	public String toString() 
	{
		return super.getTitolo()+" "+super.getAutore()+" "+getCasaEditrice()+" "+getIsbn();
	}
}
