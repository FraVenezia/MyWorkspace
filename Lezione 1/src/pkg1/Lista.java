package pkg1;

public class Lista {

	public static void main(String[] args) {
		
		Automobile auto1=new Automobile();
		Automobile auto2=new Automobile();
		
		auto1.colore="Rosso";
		auto1.marca="BMW";
		auto1.anno=2008;
		auto2.colore="Blu";
		auto2.marca="Fiat";
		auto2.anno=2016;
    
		System.out.println("La prima macchina è di colore " + auto1.colore 
														    + " a marca "
														    + auto1.marca
														    + " del "
														    + auto1.anno);
		
		System.out.println("La seconda macchina è di colore " + auto2.colore 
				                                              + " a marca "
				                                              + auto2.marca
				                                              + " del "
															  + auto2.anno);
	}

}
