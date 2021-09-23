package com.Task_Based;
import java.util.Iterator;
import java.util.ArrayList;

public class CountTwodigitNo {
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(9);
		list.add(78);
		list.add(2);
		list.add(23);
		Iterator<Integer> itr=list.iterator();
		int count=0;
		while(itr.hasNext())
		{
			Integer num=itr.next();
			System.out.println(num);
			if(num>=10&& num<=99)
			{
				count++;
			}
		}
		System.out.println("Number of 2 digit number:"+count);
		
	}
}
