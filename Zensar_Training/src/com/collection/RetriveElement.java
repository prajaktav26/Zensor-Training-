package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RetriveElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			ArrayList<Integer> al=new ArrayList<>();
			al.add(23);
			al.add(56);
			al.add(78);
			al.add(90);
			System.out.println("Enter Element to be search:");
			int s=sc.nextInt();
//			int search=Collections.binarySearch(al, s);
			for(int i=0;i<al.size();i++)
			{
				if(al.get(i)==s)
				{
					System.out.println("Element is found at:"+i);
				}
				
			}
	}

}
