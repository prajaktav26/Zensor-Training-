package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SwaptwoElements {
	public void swapElements(ArrayList<String>l)
	{
		l.add("Amisha 1");
		l.add("Vedika 2");
		l.add("Nidhi 3");
		System.out.println("Before Swap the ArrayList ");
        System.out.println(l);
        
        Collections.swap(l, 1, 2);
        System.out.println("After Swap the ArrayList");
        System.out.println(l);
 
	}
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>();
	SwaptwoElements SE=new SwaptwoElements();
			SE.swapElements(list);
}
}
