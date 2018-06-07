package Studenti;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) 
	{
		int lavoratori=0;
		Set<Studente> listStudente=new HashSet<>();
		listStudente.add(new Studente("Roberto"));
		listStudente.add(new Studente("Francesco"));
		
		Studente x=new StudenteLavoratore("Alberto", "Fornaio");
		x.setFuoricorso(true);
		listStudente.add(x);
		
		listStudente.add(new StudenteLavoratore("Maria", "Attore"));
		
		Studente x1=new Studente("Anna");
		x1.setFuoricorso(true);
		listStudente.add(x1);
		
		listStudente.add(new StudenteLavoratore("Luigi", "Taxista"));
		listStudente.add(new Studente("Alessio"));
		
		for (Studente tmp:listStudente)
			if(tmp instanceof StudenteLavoratore)
				lavoratori++;
			
		
		System.out.println("I fuoricorso sono il "+(int)percentualeFuoriCorso(listStudente)+"% su "+listStudente.size()+" studenti.");
		System.out.println("I lavoratori-fuoricorso sono il "+(int)percentualeFuoriCorsoLavoratori(listStudente)+"% su "+lavoratori+" studenti.");
	
	}
	
	public static double percentualeFuoriCorso(Set<Studente> studenti)
	{
		double fuoricorso=0;
		for (Studente tmp:studenti)
			if(tmp.isFuoricorso())
				fuoricorso++;
			
		return ((fuoricorso/studenti.size())*100);
		
	}

	public static double percentualeFuoriCorsoLavoratori(Set<Studente> studenti)
	{
		double fuoricorso=0;
		double lavoratori=0;
		for (Studente tmp:studenti)
			if(tmp instanceof StudenteLavoratore)
			{
				lavoratori++;
				if(tmp.isFuoricorso() && ((StudenteLavoratore) tmp).getProfessione()!=null)
					fuoricorso++;
			}
		
		
		return ((fuoricorso/lavoratori)*100);
	}

}
