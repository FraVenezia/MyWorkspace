package pkg3;

public class Rettangolo {
	int base;
	int altezza;
	
	public int area(int a,int b)
	{
		return a*b;	
	}
	
	public int perimetro(int a,int b)
	{
		return (a+b)*2;	
	}
	
	public void frase()
	{
		System.out.println("Io sono il rettangolo");
	}

	public String eco(String word)
	{
		return word+word;
	}
}
