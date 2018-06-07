package pkg1;
public class AM extends A
{
	private String sigla;
	private double potenzaCV;
	
	public AM(String sigla,double potenzaCV)
	{
		this.sigla=sigla;
		this.potenzaCV=potenzaCV;
	}

	@Override
	public boolean superiore(Object x) 
	{
		if(potenzaCV==((AM) x).getPotenzaCV())
			return true;
		else
			return false;
	}

	public String getSigla() {return sigla;}
	public double getPotenzaCV() {return potenzaCV;}

}
