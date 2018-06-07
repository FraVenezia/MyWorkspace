package pkg1;

import java.time.LocalDate;
import java.time.Period;

public class DiffData {

	public static void main(String[] args) {
		LocalDate pdate = LocalDate.of(2018, 3, 27);
		LocalDate now = LocalDate.now();
	 
	    Period diff = Period.between(pdate, now);
	 
	    System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
	                    diff.getYears(), diff.getMonths(), diff.getDays());
	    
	    System.out.println(pdate);
	    System.out.println(now);

	}

}
