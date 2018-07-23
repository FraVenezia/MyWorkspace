package it.begear.model;

public class sss<E> {
	private E ll;

	public E getLl() {
		return ll;
	}

	public void setLl(E ll) {
		this.ll = ll;
	}

	public <T> void scorri(T[] array) {
		for (T tmp : array)
			System.out.println(tmp);
	}
}
