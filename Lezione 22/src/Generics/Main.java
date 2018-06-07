package Generics;

public class Main {

	public static void main(String[] args) {
		Contenitore contenitore=new Contenitore();
		contenitore.setObject("Stringa");
		//contenitore.setObject(new Integer(1));
		String object=(String)contenitore.getObject();
		System.out.println(object);
	}

}
