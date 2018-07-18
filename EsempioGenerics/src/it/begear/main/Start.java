package it.begear.main;

import it.begear.model.ClasseGenerica;

public class Start {

	public static void main(String[] args) {
		Integer[] arrayInt= {1,2,3,4};
		Character[] arrayChar= {'C','I','A','O'};
		Start.stampaArray(arrayInt);
		Start.stampaArray(arrayChar);
		
		ClasseGenerica<Integer> var=new ClasseGenerica<>();
		var.setParametro(2);
		System.out.println(var.getParametro());
		
		ClasseGenerica<String> var2=new ClasseGenerica<>();
		var2.setParametro("Ciao");
		System.out.println(var2.getParametro());
		
		
	}
	
	public static <T> void stampaArray(T[] inputArray) {
		for(T tmp: inputArray)
			System.out.println(tmp);

	}
		

}
