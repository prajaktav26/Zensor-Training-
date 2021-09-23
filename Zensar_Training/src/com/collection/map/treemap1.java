package com.collection.map;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class treemap1 {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm1 = new TreeMap<>(Collections.reverseOrder());
		tm1.put(45, "sdfds");
		tm1.put(4, "swf");
		tm1.put(25, "fdg");
		System.out.println("Tree Map...");
		System.out.println(tm1);

		TreeMap<Magezine, String> tm2 = new TreeMap<>(new ByCostComparator());
		tm2.put(new Magezine(1267,"Weekly Update on City", "Anand", 225.00f),"Pune");
		tm2.put(new Magezine(1234,"India Today","Rakesh",234.45f),"Mumbai");
		tm2.put(new Magezine(1236,"Cultural Pune","Jaya",54.45f),"Nasik");
		tm2.put(new Magezine(1567, "Share Market","Harsh",454.55f),"Nasik");
		
		System.out.println("TreeMap contains...");
		Set<Magezine> keyset = tm2.keySet();
		Iterator<Magezine> itr1 = keyset.iterator();
		while(itr1.hasNext())
		{
			Magezine m = itr1.next();
			String city = tm2.get(m);
			System.out.println(m + " from city : "+city);
		}
		
	}

}
