package pkg4;

public class Dado extends OggettiGiocoAzzardo 
{

	public int lancio() 
	{
		return (int) (Math.random()*5)+1;
	}
	
}


