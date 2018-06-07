package Ristorante;
import java.util.*;
public class Tavoli 
{
	private Map<Integer,Integer> tavoli=new HashMap<>();
	
	public Tavoli() 
	{
		//Tavoli
		tavoli.put(1,6);
		tavoli.put(2,8);
		tavoli.put(3,2);
		tavoli.put(4,4);
		tavoli.put(5,10);
		tavoli.put(6,2);
	}

	public Map<Integer, Integer> getTavoli() {
		return tavoli;
	}

}
