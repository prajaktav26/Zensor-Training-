package com.collection.map;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Iterator;

public class treeset1 {
	public static void main(String[] args) {
		TreeSet<Magezine> tset =new TreeSet<>();
		tset.add(new Magezine(1267,"Weekly Update on City", "Anand", 225.00f));
		tset.add(new Magezine(1234,"India Today","Rakesh",234.45f));
		tset.add(new Magezine(1236,"Cultural Pune","Jaya",54.45f));
		tset.add(new Magezine(1567, "Share Market","Harsh",454.55f));
		tset.add(new Magezine(1567, "Share Market","Harsh",454.55f));

		System.out.println("Tree Set contains...");
		Iterator<Magezine> itr = tset.iterator();
		while(itr.hasNext())
		{
			Magezine m = itr.next();
			System.out.println(m);
		}
	}

}
