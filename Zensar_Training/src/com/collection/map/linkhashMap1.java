package com.collection.map;

import java.util.LinkedHashMap;

public class linkhashMap1 {
	public static void main(String[] args) {
		
	
	LinkedHashMap<Integer,String> lmap = new LinkedHashMap<>(12,0.70f,true);
	lmap.put(23,"KKK");
	lmap.put(12,"lll");
	lmap.put(67,"jjj");
	System.out.println(lmap);
	String v = lmap.get(23);
	System.out.println(lmap);	

}
}