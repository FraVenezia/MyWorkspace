package pkg1;

import java.util.Scanner;

public class Varargs 
{
	public void inserimento(int... a) 
	{
		for(int b:a)
			System.out.println(b);
	}
}
