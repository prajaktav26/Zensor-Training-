package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class MatchTwoCollections {
	public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	ArrayList<Integer> al1=new ArrayList<>();
	al.add(12);
	al.add(34);
	al.add(89);
	al.add(78);
	
	al1.add(34);
	al1.add(87);
	al1.add(67);
	al1.add(87);
	
	Collections.sort(al);
	Collections.sort(al1);
	
	boolean isEqual = al.equals(al1);
	System.out.println(isEqual);
	}
	

}
