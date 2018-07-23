package esempi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
	
		
		CarteDaGioco ss=CarteDaGioco.Cuori;
		
		int[] array = { 1, 2, 3, 4, 5 };
		for (int tmp : array) {
			System.out.println(tmp);
		}

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.forEach(l->System.out.println(l));

		List<int[]> list2 = new ArrayList<>();
		list2.add(new int[3]);

		for (int[] tmp : list2)
			tmp[0] = 1;

		System.out.println(list2.get(0)[0]);

		String a = new String("Arrivederci");
		a = EstFinale.cambia(a);
		System.out.println(a);

		int uno = 2;
		int due = 3;
		int y = uno < due ? uno : due;
		System.out.println(y);

		EstFinale[] arrayFin = new EstFinale[2];

		for (int i = 0; i <= 10; i++) {
			if (i == 5)
				continue;
			System.out.println(i);
		}
		
		List<Integer> prova=new ArrayList<>();
		prova.add(1);
		prova.add(2);
		
		Iterator<Integer> iter= prova.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		Map<Integer, String> map=new HashMap<Integer,String>();
		map.put(1, "Ciao");
		map.put(2, "Salute");
		Iterator<Integer> key=map.keySet().iterator();
		int dd;
		while(key.hasNext()) {
			dd=key.next();
			System.out.println("Chiave: "+dd+" Valore: "+map.get(dd));
		}
		
		for (Map.Entry<Integer, String> tmp:map.entrySet())
			System.out.println(tmp.getValue()+tmp.getKey());

		
		
		System.out.println(prova.get(0));
		
		Pol1 o=new Pol2();
		((Pol2) o).setX(4);
	}

}
