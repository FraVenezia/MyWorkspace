package it.begear.model;

public class ClasseGenerica<E> {
	
	private static ClasseGenerica instance=null;
	
	private ClasseGenerica() {}
	
	public ClasseGenerica getInstance() {
		if(instance==null)
			return new ClasseGenerica();
		else
			return instance;
	}
	
	private E parametro;

	public E getParametro() {
		return parametro;
	}

	public void setParametro(E parametro) {
		this.parametro = parametro;
	}
	
}
