package it.begear.example.dao;

import it.begear.ufficio.model.Dipartimento;

public interface DaoDipartimento {
	public abstract void createDipartimento(Dipartimento dip);
	public abstract void readDipartimento();
	public abstract void updateDipartimento(Dipartimento dip);
	public abstract void deleteDipartimento(String nome);
}
