package pkg1;

public class Prove {

	public static void main(String[] args) {
		Inserimento vet1=new Inserimento();
		int[] vet=new int[5];
		vet=vet1.vettore(vet);
		
		for(int i=0;i<5;i++)
			System.out.println(vet[i]);
		
		int a=vet.length;
		System.out.println(a);
	}

}
