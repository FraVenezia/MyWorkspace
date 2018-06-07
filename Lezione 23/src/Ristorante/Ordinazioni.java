package Ristorante;
import java.util.*;

public class Ordinazioni 
{
	private int tavolo;
	private int commensali;
	private Map<String,Double> ordine=new HashMap<>();
	
	public Ordinazioni(int tavolo,int commensali)
	{
		this.tavolo=tavolo;
		this.commensali=commensali;
	}
	
	public Map<String, Double> getOrdine() {
		return ordine;
	}

	public int getTavolo() {
		return tavolo;
	}

	public int getCommensali() {
		return commensali;
	}

	public void setOrdine(String chiave,Double prezzo)
	{
		ordine.put(chiave,prezzo);
	}
	
	public double conto()
	{
		double somma=0;
		Set list  = ordine.keySet();
		Iterator iter = list.iterator();
					
		while(iter.hasNext()) {
		     Object key = iter.next();
		     somma+= ordine.get(key);
		}
		return somma;
	}
	

}
