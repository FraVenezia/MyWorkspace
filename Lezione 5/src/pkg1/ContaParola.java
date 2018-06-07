package pkg1;
import java.util.Scanner;
public class ContaParola {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Inserisci la parola: ");
		String str=in.nextLine();
		
		int somma=0;
		int i=0;
		int vocali=0;
		
		String str3=str+"/";
		char k= str.charAt(0);
		
		while (k!='/')
		{
			somma++;
			i++;
			k=str3.charAt(i);
			
			if(k=='a' || k=='e' || k=='i' || k=='o' || k=='u')
				vocali++;
			
		}
		
		//metodo lungo
		/*int somma=1;
		int vocali=0;
		int i=0;
		String str2="";
		
		char l=str.charAt(i);
		str2+=l;
		
		while (!(str.equals(str2)))
		{
			somma++;
			i++;
			l=str.charAt(i);
			str2+=l;
			
			if(l=='a' || l=='e' || l=='i' || l=='o' || l=='u')
				vocali++;	
		}*/
		
		System.out.println("La somma delle lettere è: " +somma);
		System.out.print("La somma delle vocali è: " +vocali);
		
	}

}
