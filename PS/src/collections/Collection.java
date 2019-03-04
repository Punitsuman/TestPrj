package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class Collection {
	
	
   public static void main(String[] args) {
	   
	    List<String> list = new ArrayList<String>();	
		Set<String> set = new HashSet<String>();
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		list.add("Punit");
		list.add("Pushkar");
		list.add("Punit");
		
		System.out.println(list.get(1));
		
		Iterator<String> listItr = list.iterator();
		
		while(listItr.hasNext())
			System.out.println(listItr.next());
		
		set.add("Punit");
		set.add("Pushkar");
		System.out.println(set.add("Punit"));
		
		Iterator<String> setItr = set.iterator();
		
		while(setItr.hasNext())
			System.out.println(setItr.next());
		
		
		map.put(1, "Punit");
		map.put(2, "Pushkar");
		map.put(3, "Prachi");
		
		Set<Entry<Integer, String>> mapES = map.entrySet();
		
		for(Entry<Integer, String> es : mapES)			
			System.out.println(es.getKey() + "----" + es.getValue());
		

	}


}

