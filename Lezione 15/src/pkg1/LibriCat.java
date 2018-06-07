package pkg1;

public class LibriCat extends Libri
{
	public LibriCat(String titolo,int anno,int costo)
	{
		super.setTitolo(titolo);
		super.setAnno(anno);
		super.setCosto(costo);
	}

	boolean stessocosto(Object x) 
	{

		
		if (super.getCosto()==((Libri) x).getCosto())
			return true;
		else
			return false;
	}

}
