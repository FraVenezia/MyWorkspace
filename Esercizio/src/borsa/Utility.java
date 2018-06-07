package borsa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Utility {
	private static List<String> operazioni;
	
	public static void readFile(){
		operazioni=new ArrayList<>();
		String app;
		try {
			FileReader f;
			f=new FileReader("Operazioni.txt");

			BufferedReader b;
			b=new BufferedReader(f);

			while(true) {
				app=b.readLine();
				if(app==null)
					break;
				operazioni.add(app);
			}
			f.close();	
		}
		catch (IOException exc){
			System.out.println("Il file non esiste");
		}
	}
	
	public static void iteratorList() {
		for(String tmp: operazioni)
		{
			if(tmp.charAt(tmp.length()-2)=='B')
				Utility.Buy(tmp);
			if(tmp.charAt(tmp.length()-2)=='S')
				Utility.Sell(tmp);
		}
	}
	
	private static void Buy(String oper) {
		int j,cont=0;
		String numTemp="";
		double spesa=1;
		for (int i=0;i<oper.length();i++){
			if(oper.charAt(i)==' '){
				j=i+1;
				cont++;
				spesa=1;
				if(cont<=2) {
					while (oper.charAt(j)!=' '){
						numTemp+=oper.charAt(j);
						j++;
					}
					if(cont<=2)
						spesa*=Double.parseDouble(numTemp);
				}
				numTemp="";
			}
		}
		System.out.println(spesa);
	}
	
	private static void Sell(String oper) {
		
	}
}
