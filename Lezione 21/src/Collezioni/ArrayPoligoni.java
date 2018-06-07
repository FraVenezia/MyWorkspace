package Collezioni;

import java.util.*;

public class ArrayPoligoni {

	public static void main(String[] args) 
	{
		//Quadrato
		Scanner in=new Scanner(System.in);
		List<PoligonoInterface> quadrati=new ArrayList<>();
		
		System.out.println("Quanti quadrati vuoi inserire? ");
		int sceltaQuadrati=in.nextInt();
		for(int i=0;i<sceltaQuadrati;i++)
		{
			in=new Scanner(System.in);
			System.out.println("Inseriscimi il lato del "+(i+1)+"° quadrato");
			quadrati.add(new Quadrato(in.nextDouble()));
		}
		
		double area=0;
		double lato=0;
		for (PoligonoInterface tmp:quadrati)
			if(area<tmp.area())
			{
				area=tmp.area();
				lato=((Quadrato) tmp).getLato();
			}
		System.out.println("(Calcolo con il ForEach) Il quadrato con il lato "+lato+" ha l'area più grande: "+area);
		
		area=0;
		Iterator<PoligonoInterface> iterator=quadrati.iterator();
		while(iterator.hasNext())
		{
			PoligonoInterface x=iterator.next();
			if(area<x.area())
			{
				area=x.area();
				lato= ((Quadrato) x).getLato();
			}
		}
		System.out.println("(Calcolo con l'Iterator) Il quadrato con il lato "+lato+" ha l'area più grande: "+area);
		
		
		
		
		
		//Rettangolo
				in=new Scanner(System.in);
				List<PoligonoInterface> rettangoli=new ArrayList<>();
				
				System.out.println("Quanti rettangoli vuoi inserire? ");
				int sceltaRettangoli=in.nextInt();
				for(int i=0;i<sceltaRettangoli;i++)
				{
					in=new Scanner(System.in);
					System.out.println("Inseriscimi la base del "+(i+1)+"° rettangolo");
					double base=in.nextDouble();
					in=new Scanner(System.in);
					System.out.println("Inseriscimi l'altezza del "+(i+1)+"° rettangolo");
					double altezza=in.nextDouble();
					rettangoli.add(new Rettangolo(base,altezza));
				}
				
				area=0;
				double base=0;
				double altezza=0;
				for (Object tmp:rettangoli)
					if(area<((Rettangolo) tmp).area())
					{
						area=((Rettangolo) tmp).area();
						base=((Rettangolo) tmp).getBase();
						altezza=((Rettangolo) tmp).getAltezza();
					}
				System.out.println("(Calcolo con il ForEach) Il rettangolo con base "+base+" e altezza "+altezza+" ha l'area più grande: "+area);
				
				area=0;
				Iterator<PoligonoInterface> iteratorRet=rettangoli.iterator();
				while(iteratorRet.hasNext())
				{
					Object x=iteratorRet.next();
					if(area<((Rettangolo) x).area())
					{
						area=((Rettangolo) x).area();
						base=((Rettangolo) x).getBase();
						altezza=((Rettangolo) x).getAltezza();
					}
				}
				System.out.println("(Calcolo con l'iterator) Il rettangolo con base "+base+" e altezza "+altezza+" ha l'area più grande: "+area);
			
	}
}
