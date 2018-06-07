package it.begear.jse1.model;

//Brano estende Media, sfrutta i Membri della classe padre e ne specifica degli altri
public class Brano extends Media
{
	//Variabili di instanza che specificano caratteristiche tipiche solo del Brano
	private float durata;
	private String etichetta;
	private String album;
	private String cantante;
	private int idBrano;
	
	public Brano(String titolo, String autore,String cantante,int idBrano) 
	{
		super(titolo, autore);
		this.cantante=cantante;
		this.idBrano=idBrano;
		
	}
	
	public void setDurata(float durata) {this.durata=durata;}
	public void setEtichetta(String etichetta) {this.etichetta=etichetta;}
	public void setAlbum(String album) {this.album=album;}
	public void setCantante(String cantante) {this.cantante=cantante;}
	public void setidBrano(int idBrano) {this.idBrano=idBrano;};

	public float getDurata() {return durata;}
	public String getEtichetta() {return etichetta;}
	public String getAlbum() {return album;}
	public String getCantante() {return cantante;}
	public int getidBrano() {return idBrano;}

	@Override
	public String toString() 
	{
		return super.getTitolo()+" "+super.getAutore()+" "+getCantante()+" "+getidBrano();
	}

}
