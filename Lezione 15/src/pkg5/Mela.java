package pkg5;

public class Mela implements Comparable{
    private int grammi;
    private String tipo;

    public Mela(String tipo, int grammi){
        this.tipo = tipo;
        this.grammi = grammi;
    }

    public int compareTo(Object m){
        return grammi - ((Mela) m).getGrammi();
    }

	public int getGrammi() {
		return grammi;
	}
    
}