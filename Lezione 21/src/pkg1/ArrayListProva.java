package pkg1;
import java.util.*;

public class ArrayListProva 
{
	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<>();
		list.add(25);
		list.add(67);
		list.add(74);
		
		int size=list.size();
		for(int i=0;i<size;i++)
			System.out.println(list.get(i));
		
		for (Integer tmp:list)
			System.out.println(tmp);
		
		Iterator<Integer> iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}
}
