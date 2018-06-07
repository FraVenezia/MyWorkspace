package pkg3;

import java.util.Scanner;

public class Bancomat
{

	public static void main(String[] args) 
	{
		ContoBancario conto=new ContoBancario();
		
		Scanner in=new Scanner(System.in);
		System.out.println("Buongiorno.Inserisca il codice PIN");
		conto.setCodiceInserito(in.nextInt());
		
		System.out.println(conto.getContoBancario());
		
	}

}
