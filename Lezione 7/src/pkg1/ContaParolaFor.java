package pkg1;

import java.util.Scanner;

public class ContaParolaFor {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Inserisci la parola che vuoi analizzare: ");
		String parola=in.nextLine();
		
		parola+="/";
		int i=0,somma=0,vocali=0;
		char k=parola.charAt(0);
		
		for (;true;)
		{
			somma++;
			i++;
			k=parola.charAt(i);
			
			if(k=='a' || k=='e' || k=='i' || k=='o' || k=='u')
				vocali++;
			
			if(parola.charAt(i)=='/')
				break;
		}
		
		System.out.println("La somma delle lettere è: " +somma);
		System.out.print("La somma delle vocali è: " +vocali);
		
	}

}
