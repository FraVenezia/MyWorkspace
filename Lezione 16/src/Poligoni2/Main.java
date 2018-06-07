package Poligoni2;

public class Main {

	public static void main(String[] args)
	{
		Poligono[] pol=new Poligono[4];
		pol[0]=new Quadrato(2);
		pol[1]=new Quadrato(3);			
		pol[2]=new Rettangolo(2,5);
		pol[3]=new Rettangolo(4,6);
		
		
		for(Poligono app:pol)
		{
			if(app instanceof Quadrato)
				System.out.println("Il perimetro del quadrato è: " + app.perimetro() +" l'area del quadrato: "+ app.area());
			else
				System.out.println("Il perimetro del rettangolo è: " + app.perimetro() +" l'area del rettangolo: "+ app.area());
			
		}
	}	
}
