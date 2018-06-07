package pkg1;
import java.util.Scanner;
public class TryCatch 
{
	public static void main(String[] args) 
	{
		try 
		{
			Scanner in=new Scanner(System.in);
			System.out.println("Inserisci a: ");
			int a=in.nextInt();
			
			in=new Scanner(System.in);
			System.out.println("Inserisci b: ");
			int b=in.nextInt();
		
			int c=a/b;
			System.out.println("Il risultato è: "+ c);
		}
		catch (ArithmeticException exc)
		{
			System.out.println("Divisione per zero...");
		}
		catch (NullPointerException exc)
		{
			System.out.println("Reference nullo");
		}
		catch (Exception exc)
		{
			System.out.println("Errore generico");
		}
		finally
		{
			System.out.println("Operazione Terminata");
		}
	}
}
