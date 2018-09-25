package pkg1;

import java.util.Date;
import java.util.GregorianCalendar;

public class LIST {
	

	
	public static void main(String[] args) {
		System.out.println(provaEccezione());
		
	}
	
	public static String provaEccezione() {
		try {
			int a=2/0;
		}
		catch (Exception ex) {
			System.out.println("eccezione");
			return "torno il catch";
		}
		finally {
			return "ho fatto il finally";
		}
	}

}
