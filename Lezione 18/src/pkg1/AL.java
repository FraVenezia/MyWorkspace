package pkg1;
public class AL extends A
{
	private String sigla;
	private int efficienzaAerodinamica;

	public AL(String sigla,int efficienzaAerodinamica)
	{
		this.sigla=sigla;
		this.efficienzaAerodinamica=efficienzaAerodinamica;
	}
	
	@Override
	public boolean superiore(Object x) 
	{
		if(efficienzaAerodinamica==((AL) x).getEfficienzaAerodinamica())
			return true;
		else
			return false;
	}

	public String getSigla() {return sigla;}
	public int getEfficienzaAerodinamica() {return efficienzaAerodinamica;}
	

}
