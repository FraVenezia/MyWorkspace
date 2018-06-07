package Negozio;

import java.time.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Alimentari extends Prodotti
{
	private GregorianCalendar data;

	public Alimentari(int codice,String descrizione,double prezzo,int anno,int mese,int giorno) {
		super(codice,descrizione,prezzo);
		this.setData(anno, mese, giorno);
	}
	
	public GregorianCalendar getData() 
	{
		return data;
	}

	public void setData(int anno,int mese,int giorno) 
	{
		data=new GregorianCalendar(anno,mese,giorno); 
		this.data = data;
		
	}
	
	public double applicaSconto() 
	{
		LocalDate pdate = LocalDate.of(getData().get(Calendar.YEAR)
				                      ,(getData().get(Calendar.MONTH)+1)
				                      ,getData().get(Calendar.DAY_OF_MONTH));
		
		LocalDate now = LocalDate.now();
	    Period diff = Period.between(pdate, now);
	    
	    if(diff.getDays()<=0 & diff.getDays()>=-10)
		    return (getPrezzo()-(getPrezzo()*20)/100);
	    else
	    		return super.applicaSconto();
	}		
}	

