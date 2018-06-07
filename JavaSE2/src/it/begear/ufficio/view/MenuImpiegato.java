package it.begear.ufficio.view;

import java.util.InputMismatchException;
import java.util.logging.Level;
import it.begear.example.crud.CrudImpiegato;
import it.begear.example.dao.DaoImpiegato;
import it.begear.ufficio.util.Insert;
import it.begear.ufficio.util.MioLog;
import it.begear.ufficio.util.ResetScanner;

public class MenuImpiegato {

	private static DaoImpiegato crudImp=new CrudImpiegato();

	public static void menuOperazioneImpiegato(){
		MioLog.getIstanzaMioLogger().log(Level.INFO,"Menu Impiegato Avviato");
		System.out.println("Scegli l'operazioni sulla Tabella Impiegato");
		System.out.println("1.Crea Impiegato");
		System.out.println("2.Leggi tutta la Tabella Impiegato");
		System.out.println("3.Aggiorna Impiegato");
		System.out.println("4.Cancella Impiegato");
		System.out.println("5.Torna al menù principale");
		System.out.println("6.Esci");
		System.out.println("Inserisci scelta: ");
		try {
			switch (ResetScanner.newScanner().nextInt()) {
			case 1:{
				crudImp.createImpiegato(Insert.insertImpiegato());
				break;
			}
			case 2:{
				crudImp.readImpiegato();
				break;
			}
			case 3:{
				crudImp.updateImpiegato(Insert.insertImpiegato());
			}
			case 4:{
				System.out.println("Inserisci l'ID dell'Impiegato che vuoi cancellare");
				crudImp.deleteImpiegato(ResetScanner.newScanner().nextInt());
				break;
			}
			case 5:{
				MenuPrincipale.menuHome();
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
