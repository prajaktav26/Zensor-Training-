package com.collection.map;

import java.util.LinkedHashSet;

import java.util.Iterator;

public class linkedhashset1 {
	public static void main(String[] args) {
		LinkedHashSet<Magezine> mset =new LinkedHashSet<>();
		mset.add(new Magezine(1267,"Weekly Update on City", "Anand", 225.00f));
		mset.add(new Magezine(1234,"India Today","Rakesh",234.45f));
		mset.add(new Magezine(1236,"Cultural Pune","Jaya",54.45f));
		mset.add(new Magezine(1567, "Share Market","Harsh",454.55f));
		mset.add(new Magezine(1567, "Share Market","Harsh",454.55f));
		mset.add(null);
		System.out.println("Linked Hash Set contains...");
		Iterator<Magezine> itr = mset.iterator();
		while(itr.hasNext())
		{
			Magezine m = itr.next();
			System.out.println(m);
		}
	}

}
