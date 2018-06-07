package pkg1;

import java.util.Scanner;

public class NumeroRomano {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Inserisci il numero che vuoi convertire: ");
		int num=in.nextInt();
		
		int app=(int) num/1000;
	    num-=(app*1000);
	    
	    switch (app)
		{
		case 1:
			System.out.print("M");
			break;
		case 2:
			System.out.print("MM");
			break;
		case 3:
			System.out.print("MMM");
			break;
		}
	    
	    app=(int) num/100;
	    num-=(app*100);
	    
	    switch (app)
		{
		case 1:
			System.out.print("C");
			break;
		case 2:
			System.out.print("CC");
			break;
		case 3:
			System.out.print("CCC");
			break;
		case 4:
			System.out.print("CD");
			break;
		case 5:
			System.out.print("D");
			break;
		case 6:
			System.out.print("DC");
			break;
		case 7:
			System.out.print("DCC");
			break;
		case 8:
			System.out.print("DCCC");
			break;
		case 9:
			System.out.print("CM");
			break;
		}
	    
	    app=(int)num/10;
	    num-=(app*10);
		
	    switch (app)
		{
		case 1:
			System.out.print("X");
			break;
		case 2:
			System.out.print("XX");
			break;
		case 3:
			System.out.print("XXX");
			break;
		case 4:
			System.out.print("XL");
			break;
		case 5:
			System.out.print("L");
			break;
		case 6:
			System.out.print("LX");
			break;
		case 7:
			System.out.print("LXX");
			break;
		case 8:
			System.out.print("LXXX");
			break;
		case 9:
			System.out.print("XC");
			break;
		}
	    
	    switch (num)
		{
		case 1:
			System.out.print("I");
			break;
		case 2:
			System.out.print("II");
			break;
		case 3:
			System.out.print("III");
			break;
		case 4:
			System.out.print("IV");
			break;
		case 5:
			System.out.print("V");
			break;
		case 6:
			System.out.print("VI");
			break;
		case 7:
			System.out.print("VII");
			break;
		case 8:
			System.out.print("VIII");
			break;
		case 9:
			System.out.print("IX");
			break;
		}
	  	
	}
}
