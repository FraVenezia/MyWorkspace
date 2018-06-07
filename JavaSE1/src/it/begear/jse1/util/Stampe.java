package it.begear.jse1.util;

import it.begear.jse1.exception.MiaEccezione;
import it.begear.jse1.model.*;

public final class Stampe
{
	public static void stampa(Media x) throws MiaEccezione
	{	
		if(x!=null)
		{
			System.out.println(x);
			if (x instanceof Libro)
				for (Media tmp:((Libro) x).getLibreria())
					if(tmp!=null)
						System.out.println(tmp);
		}
		else
			throw new MiaEccezione();
	}
}
