package com.collection;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class SearchElement {
	
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		al.add(23);
		al.add(56);
		al.add(78);
		al.add(90);
		System.out.println("Enter Position of Element to be search:");
		int s=sc.nextInt();
		
		int search=al.indexOf(s);
		if(search==-1)
		{
			System.out.println("Element is not found");
		}
		else
		{
			System.out.println("Element is found at:"+search);
		}
		
}
}
