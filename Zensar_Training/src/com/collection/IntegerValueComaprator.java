package com.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class IntegerValueComaprator{

	
	public static void main(String[] args) {
		ArrayList<Integer> intlist=new ArrayList<>();
		intlist.add(123);
		intlist.add(678);
		intlist.add(123);
		intlist.add(908);
		intlist.add(345);
//		Collections.sort(intlist,Collections.reverseOrder());
		IntegerValueComaprator Iv=new IntegerValueComaprator();
		Collections.sort(intlist,Collections.reverseOrder());

		System.out.println(intlist);
			
		
		
	}



}
