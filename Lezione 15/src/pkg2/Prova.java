package pkg2;

public class Prova {

	public static void main(String[] args) 
	{
		Libro l1=new Libro("storia",35);
		Libro l2=new Libro("letteratura",17);
		Libro l3=new Libro("storia",10);
		
		if(l1.uguale(l2)==true)
			System.out.println("Sono uguali l1 e l2");
		if(l1.uguale(l3)==true)
			System.out.println("Sono uguali l1 e l3");

	}

}
