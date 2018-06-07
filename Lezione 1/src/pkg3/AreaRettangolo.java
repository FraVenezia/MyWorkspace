package pkg3;

public class AreaRettangolo {

	public static void main(String[] args) {
		
		Rettangolo ret1=new Rettangolo();
		
		ret1.base=6;
		ret1.altezza=5;
		
		System.out.println("Il rettangolo ha base " + ret1.base 
				                                    + " e altezza " 
				                                    + ret1.altezza);
		
		System.out.println("La sua area è uguale a " + ret1.area(ret1.base,ret1.altezza));
		
		System.out.println("Il suo perimetro è uguale a " + ret1.perimetro(ret1.base,ret1.altezza));
		
		ret1.frase();
		
		System.out.println(ret1.eco("rettangolo"));

	}
}
