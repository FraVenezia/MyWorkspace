package pkg1;

public class Prova {

	public static void main(String[] args) 
	{
		LibriCat l1=new LibriCat("Nome della Rosa",1986,20);
		LibriCat l2=new LibriCat("Anna Karenina",1877,20);
		if(l1.stessocosto(l2)==true)
			System.out.println("I libri hanno lo stesso costo");
		else
			System.out.println("I libri hanno costi diversi");;

	}

}
