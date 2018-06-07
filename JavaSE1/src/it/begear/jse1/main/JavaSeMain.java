package it.begear.jse1.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import it.begear.jse1.exception.MiaEccezione;
import it.begear.jse1.model.*;
import it.begear.jse1.util.Stampe;

public class JavaSeMain 
{
	public static void main(String[] args) 
	{
		List<Media> media=new ArrayList<>();
		Map<String,String> mappa=new HashMap<>();
		mappa.put("A", "Ciao");
		mappa.put("B", "Arrivederci");
		mappa.put("C", "Saluti");
		
		Set<String> list  = mappa.keySet();
		Iterator<String> iter=list.iterator();
		while(iter.hasNext())
		{
			System.out.println(mappa.get(iter.next()));
		}
		
		//Creazione degli oggetti Brano e Libro assegnando il reference di Media (polimorfismo per dati)
		media.add(new Brano("Certe Notti","Luciano Ligabue","Luciano Ligabue",123));
		media.add(null);
		
		Media x = new Libro("Angeli e Demoni","Dan Brown","Mondadori","8804555572");
		((Libro) x).setLibreria();
		media.add(x);


		//Stampa tramite il metodo static nella classe Utility 
		for(Media tmp:media)
		try 
		{
			Stampe.stampa(tmp);
		}
		
		catch(MiaEccezione exc){	}

	}
}
     	