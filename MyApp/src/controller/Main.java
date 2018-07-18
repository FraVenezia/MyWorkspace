package controller;

import dao.UtenteImplDao;
import model.Utente;

public class Main {

	public static void main(String[] args) {
		UtenteImplDao.getIstance().createUtente(new Utente("admin","password"));

	}

}
