package com.collection;

import java.util.ArrayList;

public class RetainAll {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		al.add(23);
		al.add(36);
		al.add(56);
		al2.add(23);
		al2.add(36);
		al2.add(90);
		al2.add(80);
		System.out.println(al);
		al.retainAll(al2);
		System.out.println("After Retain all:"+al);
	}

}
