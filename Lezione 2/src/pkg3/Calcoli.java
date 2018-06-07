package pkg3;

public class Calcoli {
	int lato;
	int numero_lati=4;
	
	public Calcoli(int l) {
		lato=l;
	}

	public int area() {
		
		return lato*lato;
	}
	
	public int perimetro() {
		
		return lato*numero_lati;
	}
	

}
