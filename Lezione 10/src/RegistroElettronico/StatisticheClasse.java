package RegistroElettronico;

public class StatisticheClasse 
{

	public StatisticheClasse()
	{
		this.Media();
	}
	
	public void Media()
	{
		double migliore=0;
		int indice=0;
		
		for(int i=0;i<MenuSingleton.getNumAlunni();i++)
		{
			System.out.println("la pagella dello studente "+ MenuSingleton.getClasse()[i].getNomeAlunno() + " è la seguente: ");
			
			for(int j=0;j<InserisciAlunni.getMaterie().length;j++)
				System.out.println(MenuSingleton.getClasse()[i].getMaterie()[j]+": "+MenuSingleton.getClasse()[i].getVoti()[j]);
			    
			System.out.println("La media voti è: "+MenuSingleton.getClasse()[i].getMedia()+"\n");
			
			if(MenuSingleton.getClasse()[i].getMedia()>migliore)
			{
				migliore=MenuSingleton.getClasse()[i].getMedia();
				indice=i;
			}
		}
		System.out.println("Lo studente più meritevole è: "+MenuSingleton.getClasse()[indice].getNomeAlunno()+" con media voti: "+migliore+"\n");
	}
}
