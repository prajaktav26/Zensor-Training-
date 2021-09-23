package com.collection;

import java.util.ArrayList;

public class EmptyorNot {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(23);
		al.add(56);
		al.add(78);
		al.add(90);
		
		System.out.println("Empty or not:"+al.isEmpty());
		

}
}