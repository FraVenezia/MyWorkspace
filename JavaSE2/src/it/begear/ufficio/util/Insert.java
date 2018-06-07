package it.begear.ufficio.util;

import it.begear.ufficio.model.Dipartimento;
import it.begear.ufficio.model.Impiegato;

public class Insert {
	
	public static Impiegato insertImpiegato() {
		System.out.println("Inserisci il nome dell'impiegato: ");
		String nome=ResetScanner.newScanner().nextLine();
		System.out.println("Inserisci il cognome dell'impiegato: ");
		String cognome=ResetScanner.newScanner().nextLine();
		System.out.println("Inserisci il dipartimento dell'impiegato: ");
		String dipartimento=ResetScanner.newScanner().nextLine();
		System.out.println("Inserisci il numero dell'ufficio dell'impiegato: ");
		int ufficio=ResetScanner.newScanner().nextInt();
		System.out.println("Inserisci lo stipendio dell'impiegato: ");
		int stipendio=ResetScanner.newScanner().nextInt();
		return new Impiegato(0,nome,cognome,dipartimento,ufficio,stipendio);
	}
	
	public static Dipartimento insertDipartimento() {
		System.out.println("Inserisci il nome del dipartimento ");
		String nome=ResetScanner.newScanner().nextLine();
		System.out.println("Inserisci l'indirizzo del dipartimento: ");
		String indirizzo=ResetScanner.newScanner().nextLine();
		System.out.println("Inserisci la città del dipartimento: ");
		String citta=ResetScanner.newScanner().nextLine();
		return new Dipartimento(nome,indirizzo,citta);	
	}
}
