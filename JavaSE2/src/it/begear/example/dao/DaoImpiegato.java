package it.begear.example.dao;

import it.begear.ufficio.model.Impiegato;

public interface DaoImpiegato {
	public abstract void createImpiegato(Impiegato imp );
	public abstract void readImpiegato();
	public abstract void updateImpiegato(Impiegato imp);
	public abstract void deleteImpiegato(int id_imp);
}
