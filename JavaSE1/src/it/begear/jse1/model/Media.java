package it.begear.jse1.model;

public abstract class Media 
{
	//Dichiarazione delle variabili d'istanza comune alle classi che erediterano Media
	//dichiarate private sfuttando il paradigma dell'Incapsulamento tramite cui nascondiamo gli elementi implementtivi
	private String titolo;
	private String genere;
	private String autore;
	private String formato;
	private int annoUscita; 
	
	//Costruttore per la creazione dell'oggetto (Libro o Brano) già parametrizzato con Titolo e Autore
	public Media(String titolo,String autore ) 
	{
		this.titolo=titolo;
		this.autore=autore;
	}
	
	//Dichiarazione e specializazzione dei metodi set e get per la gestione delle variabili d'istanza
	public void setTitolo(String titolo) {this.titolo=titolo;}
	public void setGenere(String genere) {this.genere=genere;}
	public void setAutore(String autore) {this.autore=autore;}
	public void setFormato(String formato) {this.formato=formato;}
	public void setAnnoUScita(int annoUscita) {this.annoUscita=annoUscita;}
	
	public String getTitolo() {return titolo;}
	public String getGenere() {return genere;}
	public String getAutore() {return autore;}
	public String getFormato() {return formato;}
	public int getAnnoUScita() {return annoUscita;}
	
	//Override del metodo toString della classe Object dichiarato abstract in quando ogni classe figlio lo specializzerà in base alle proprie esigenze
	//Viene fatto l'Override anche nella superclasse per permettere la virtualizzazione quando verrà chiamato
	@Override
	public abstract String toString();

}
