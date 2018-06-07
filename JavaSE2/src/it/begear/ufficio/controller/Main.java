package it.begear.ufficio.controller;

import java.util.logging.Level;
import it.begear.ufficio.util.MioLog;
import it.begear.ufficio.view.MenuPrincipale;

public class Main {
	public static void main(String[] args) {
		MioLog.getIstanzaMioLogger().setLevel(Level.OFF);
		MenuPrincipale.menuHome();
	}
}
