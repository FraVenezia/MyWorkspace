package dao;

import java.util.List;

import model.Utente;

public interface UtenteDao {
	
	void createUtente(Utente utente);
	void deleteUtente(Utente utente);
	List<Utente> readListUtente();

}
