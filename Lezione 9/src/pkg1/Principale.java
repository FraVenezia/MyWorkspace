package pkg1;

public class Principale 
{

	public static void main(String[] args) 
	{
		Persona persona1=new Persona();
		Persona persona2=new Persona();
		
		persona1.nome="Francesco";
		persona1.cognome="Venezia";
		persona1.età=30;
		System.out.println(persona1.dettagli());
		
		persona2.nome="Loredana";
		persona2.cognome="Gaudino";
		persona2.età=24;
		System.out.println(persona2.dettagli());
		
		Persona persona3=persona1;
		System.out.println(persona3.dettagli());
	}

}
