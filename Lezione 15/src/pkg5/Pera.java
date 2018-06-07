package pkg5;

public class Pera implements Comparable{
    private int grammi;
    private String tipo;

    public Pera(String tipo, int grammi){
        this.tipo = tipo;
        this.grammi = grammi;
    }

    public int compareTo(Object p){
        return grammi - ((Pera) p).getGrammi();
    }

	public int getGrammi() {
		return grammi;
	}
    
}
