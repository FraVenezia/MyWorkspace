package pkg2;

public class Stampa {

	public static void main(String[] args) {
		
		Num stp=new Num();
		stp.Seta(5);
		stp.Setb(8);
		System.out.println(stp.Geta());
		System.out.println(stp.Getb());
		System.out.println(stp.Geta()+stp.Getb());

	}
}

