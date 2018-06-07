package pkg1;

public class Main {

	public static void main(String[] args) {
		OperazioneAritmetica oper=new OperazioneAritmetica();
		try
		{
			oper.divisione(4, 0);
		}
		catch (Exception exc)
		{
			System.out.println(exc.getMessage());
		}
	}

}
