package pkg1;
public class Main 
{
	public static void main(String[] args) 
	{
		Prova p=new Prova(3,5);
		Aggiungi a=new Aggiungi(p);
		System.out.println(p.getSomma());
	}
}
