package Ristorante;
import java.util.*;
public class Menu 
{	
	private Map<String,Double> piatti=new HashMap<>();
	private Map<String,Double> bevande=new HashMap<>();
	
	public Menu() 
	{
		//Menu Piatti
		piatti.put("Spaghetti",7.00);
		piatti.put("Maccheroni",6.50);
		piatti.put("Carne",10.00);
		piatti.put("Pesce",15.50);
		//Menu Bevande
		bevande.put("Acqua",2.00);
		bevande.put("Cola",3.00);
		bevande.put("Vino",7.50);
		bevande.put("Birra",5.00);
	}
	
	public Map<String, Double> getPiatti() {
		return piatti;
	}

	public Map<String, Double> getBevande() {
		return bevande;
	}
}
