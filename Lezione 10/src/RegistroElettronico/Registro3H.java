package RegistroElettronico;

public class Registro3H 
{
	public static void main(String[] args) 
	{
		System.out.println("Benvenuti nel registro di classe della 3H");
		while(MenuSingleton.getInstance().Scelta()!=3);
	}
}
