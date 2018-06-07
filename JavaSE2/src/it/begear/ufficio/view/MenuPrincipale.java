package it.begear.ufficio.view;

import java.util.InputMismatchException;
import java.util.logging.Level;
import it.begear.ufficio.util.MioLog;
import it.begear.ufficio.util.ResetScanner;

public class MenuPrincipale {

	public static void menuHome() {
		MioLog.getIstanzaMioLogger().log(Level.INFO,"Menu Home Avviato");
		System.out.println("Scegli su quale tabella vuoi lavorare.");
		System.out.println("1. Tabella Impiegato");
		System.out.println("2. Tabella Dipartimento");
		System.out.println("3. Esci");
		try {
			switch (ResetScanner.newScanner().nextInt())
			{
			case 1:{
				MenuImpiegato.menuOperazioneImpiegato();
				break;
			}
			case 2:{
				MenuDipartimento.menuDipartimentoImpiegato();
				break;
			}
			case 3:{
				System.out.println("Arrivederci");
				break;
			}
			default:{
				System.out.println("Scelta errata.Riprova");
				break;
			}
			}
		}
		catch (InputMismatchException exc){
			System.out.println("Carattere non consentito");	
		}
	}
}



