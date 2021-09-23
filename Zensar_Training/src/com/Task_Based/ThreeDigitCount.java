package com.Task_Based;

import java.util.ArrayList;
import java.util.Iterator;

public class ThreeDigitCount {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(122);
		list.add(9);
		list.add(786);
		list.add(2);
		list.add(2359);
		Iterator<Integer> itr=list.iterator();
		int count=0;
		while(itr.hasNext())
		{
			Integer num=itr.next();
			System.out.println(num);
			if(num>=100&& num<=999)
			{
				count++;
			}
		}
		System.out.println("Number of Three digit:"+count);
	}

}
