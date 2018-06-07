package pkg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Ordini2 
{
	public static void main(String[] args) 
	{
		
		List<Articolo> articoli=new ArrayList<>();


		articoli.add(new Libro("LO","Origins","Dan Brown",24));
		articoli.add(new Libro("LLBDM","La biblioteca dei morti","Glenn Cooper",27));
		articoli.add(new Libro("LLBDM","La biblioteca dei morti","Glenn Cooper",44));
		articoli.add(new Libro("LGOT","Games of Thrones","George R.R. Martin",12));
		articoli.add(new Libro("LO","Origins","Dan Brown",78));
		articoli.add(new Libro("LLBDM","La biblioteca dei morti","Glenn Cooper",2));
		articoli.add(new Libro("LGOT","Games of Thrones","George R.R. Martin",44));
		articoli.add(new Libro("LLBDM","La biblioteca dei morti","Glenn Cooper",45));
		
		  Collections.sort(articoli);
		  
		  for(Articolo tmp:articoli)
			  System.out.println(tmp.toString());
			
		
	}
}

		
		