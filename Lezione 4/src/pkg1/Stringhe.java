package pkg1;

import java.util.Scanner;

public class Stringhe 
{

	public static void main(String[] args) 
	{
		
		Scanner in=new Scanner(System.in);
		System.out.print("Inserisci la prima stringa: ");
		String string1=in.nextLine();
		
		in=new Scanner(System.in);
		System.out.print("Inserisci la seconda stringa: ");
		String string2=in.nextLine();
		
		in=new Scanner(System.in);
		System.out.print("Inserisci la terza stringa: ");
		String string3=in.nextLine();
		
		int lString1=string1.length();
		int lString2=string2.length();
		int lString3=string3.length();
		
		//Inizio ricerca parola più lunga
		
		System.out.print("\n");
	
		if (lString1==lString2 & lString2==lString3)
			System.out.println("Le 3 parole sono lunghe uguali");
		else
			if(lString1==lString2 & lString2>lString3)
				System.out.println("Le più lunghe sono la prima e la seconda parola");
			else
				if(lString1<lString2 & lString2==lString3)
					System.out.println("Le più lunghe sono la seconda e la terza parola");
				else
					if(lString1==lString3 & lString3>lString2)
						System.out.println("Le più lunghe sono la prima e la terza parola");
					else
						if (lString1>lString2 & lString1>lString3)
							System.out.println("La più lunga è la prima parola");
						else
							if (lString2>lString1 & lString2>lString3)
								System.out.println("La più lunga è la seconda parola");
							else
								if (lString3>lString1 & lString3>lString2)
									System.out.println("La più lunga è la terza parola");
		
		//Fine ricerca parola più lunga
		
		System.out.print("\n");
		
		//Inizio individuazione parola pari e dispari
		
		if (lString1%2==0)
			System.out.println(string1+" è una parola pari");
		else
			System.out.println(string1+" è una parola dispari");
		
		if (lString2%2==0)
			System.out.println(string2+" è una parola pari");
		else
			System.out.println(string2+" è una parola dispari");
		
		if (lString3%2==0)
			System.out.println(string3+" è una parola pari");
		else
			System.out.println(string3+" è una parola dispari");
		
		//Fine individuazione parola pari e dispari
		
		//Inizio ricerca parola con più vocali
		
		int vString1=string1.length()-string1.replaceAll("[aeiouAEIOU]","").length();
		int vString2=string2.length()-string2.replaceAll("[aeiouAEIOU]","").length();
		int vString3=string3.length()-string3.replaceAll("[aeiouAEIOU]","").length();
		
		System.out.print("\n");
			
			if (vString1==vString2 & vString2==vString3)
				System.out.println("Le 3 parole hanno lo stesso numero di vocali");
			else
				if(vString1==vString2 & vString2>vString3)
					System.out.println("Le parole con più vocali sono la prima e la seconda");
				else
					if(vString1<vString2 & vString2==vString3)
						System.out.println("Le parole con più vocali sono la seconda e la terza");
					else
						if(vString1==vString3 & vString3>vString2)
							System.out.println("Le parole con più vocali sono prima e la terza");
						else
							if (vString1>vString2 & vString1>vString3)
								System.out.println("La parole con più vocali è la prima");
							else
								if (vString2>vString1 & vString2>vString3)
									System.out.println("La parole con più vocali è la seconda");
								else
									if (vString3>vString1 & vString3>vString2)
										System.out.println("La parole con più vocali è la terza");
				 
		//Fine ricerca parola con più vocali
		
	}

}