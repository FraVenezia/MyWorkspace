package it.begear.ufficio.view;

import java.util.InputMismatchException;
import java.util.logging.Level;

import it.begear.example.crud.CrudDipartimento;
import it.begear.example.dao.DaoDipartimento;
import it.begear.ufficio.util.Insert;
import it.begear.ufficio.util.MioLog;
import it.begear.ufficio.util.ResetScanner;

public class MenuDipartimento {

	private static DaoDipartimento crudDip=new CrudDipartimento();

	public static void menuDipartimentoImpiegato(){
		MioLog.getIstanzaMioLogger().log(Level.INFO,"Menu Dipartimento Avviato");
		System.out.println("Scegli l'operazioni sulla Tabella Dipartimento");
		System.out.println("1.Crea Dipartimento");
		System.out.println("2.Leggi la tabella Dipartimento");
		System.out.println("3.Aggiorna Dipartimento");
		System.out.println("4.Cancella Dipartimento");
		System.out.println("5.Torna al menù principale");
		System.out.println("6.Esci");
		System.out.println("Inserisci scelta: ");
		try {
			switch (ResetScanner.newScanner().nextInt()) {
			case 1:{
				crudDip.createDipartimento(Insert.insertDipartimento());
				break;
			}
			case 2:{
				crudDip.readDipartimento();
				break;
			}
			case 3:{
				crudDip.updateDipartimento(Insert.insertDipartimento());
			}
			case 4:{
				System.out.println("Inserisci il nome del Dipartimento che vuoi cancellare");
				crudDip.deleteDipartimento(ResetScanner.newScanner().nextLine());
				break;
			}
			case 5:{
				MenuPrincipale.menuHome();
				break;
			}
			case 6:{
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


