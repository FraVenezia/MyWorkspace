package CarrelloElettronico;

import java.util.Iterator;
import java.util.List;

public final class GestioneListe 
{
	public static void scorriLista(List<Articolo> appoggio)
	{
		double somma=0;
		for(Articolo tmp:appoggio)
		{
			System.out.println(tmp.toString());
			somma+=tmp.getPrezzoProd();
		}
		System.out.println("Se acquisti ora pagherai: "+somma+"€");
	}
	
	public static void scorriLista(List<Articolo> appoggio,int scelta) throws CustomExceptions
	{
		switch(scelta)
		{
			case 1:
			{
				for(Articolo tmp:appoggio)
					if(tmp instanceof Gioco)
						System.out.println(tmp.toString());
				break;
			}
			case 2:
			{
				for(Articolo tmp:appoggio)
					if(tmp instanceof Libro)
						System.out.println(tmp.toString());
				break;
			}
			case 3:
			{
				for(Articolo tmp:appoggio)
					if(tmp instanceof Console)
						System.out.println(tmp.toString());
				break;
			}
			default:
			{
				throw new CustomExceptions();
			}
		}
	}
	
	public static void riempiCarrello(List<Articolo> articoli,List<Articolo> carrello,int scelta,String scelta3) throws CustomExceptions
	{
		int cont=0;
		switch(scelta)
		{
			case 1:
			{
				for(Articolo tmp:articoli)
					if(tmp instanceof Gioco)
						if(scelta3.equals(tmp.getIdProd()))
						{
							carrello.add(new Gioco(tmp.getIdProd(),tmp.getNomeProd(),((Gioco) tmp).getTipoConsole(),tmp.getPrezzoProd()));
							cont++;
						}
							
				break;
			}
			case 2:
			{
				for(Articolo tmp:articoli)
					if(tmp instanceof Libro)
						if(scelta3.equals(tmp.getIdProd()))
						{
							carrello.add(new Libro(tmp.getIdProd(),tmp.getNomeProd(),((Libro) tmp).getAutore(),tmp.getPrezzoProd()));
							cont++;
						}
				break;
			}
			case 3:
			{
				for(Articolo tmp:articoli)
					if(tmp instanceof Console)
						if(scelta3.equals(tmp.getIdProd()))
						{
							carrello.add(new Console(tmp.getIdProd(),tmp.getNomeProd(),tmp.getPrezzoProd()));
							cont++;
						}
				break;
			}
		}
		if (cont==0)
		{
			throw new CustomExceptions();
		}
	}
	
	public static void cancellaLista(List<Articolo> appoggio,String scelta2) throws CustomExceptions
	{
		int cont=0;
		Iterator<Articolo> iterator=appoggio.iterator();
		while(iterator.hasNext())
		{
			if(iterator.next().getIdProd().equals(scelta2))
			{
				iterator.remove();
				System.out.println("Rimozione correttamente eseguita....");
				cont++;
				break;
			}
		}
		if (cont==0)
		{
			throw new CustomExceptions();
		}
	}
}
