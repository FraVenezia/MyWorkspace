package pkg5;

public class TestMelaPera{

    public static void main (String [] args){
        Comparable mela = new Mela("golden",135);
        Comparable pera = new Pera("williams",120);
        int comp = pera.compareTo(mela); // errore di compilazione
    }
}