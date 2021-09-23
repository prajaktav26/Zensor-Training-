package com.collection.map;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Hashing {
	public static void main(String[] args) {
		//Hash Map
		ArrayList<Magezine> l = new ArrayList<>();
		HashMap<String,String> map = new HashMap<>();
		l.add(new Magezine(1267,"Weekly Update on City", "Anand", 225.00f));
		l.add(new Magezine(1234,"India Today","Rakesh",234.45f));
		l.add(new Magezine(1236,"Cultural Pune","Jaya",54.45f));
		l.add(new Magezine(1567, "Share Market","Harsh",454.55f));
		System.out.println("ArrayList contains...");
		Iterator<Magezine> itr = l.iterator();
		while(itr.hasNext())
		{
			Magezine m = itr.next();
			map.put(m.mName, m.editor);
			map.put("navbharat", "aditya");
			
			System.out.println(m);
		}
		System.out.println(("Map contains..."));
		System.out.println(map);
		
		
		
		
		
		
	}
	
	
	
}