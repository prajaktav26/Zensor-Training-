package com.collection;
import java.util.ArrayList;
public class ArrListInt2 {
	ArrayList<Integer>l;
	ArrayList<Integer>l1;
//	ArrayList<int>l
	public ArrListInt2()
	{
		l=new ArrayList<>();
		l1=new ArrayList<>();
	}
	public void makeList()
	{
		l.add(3);
		l.add(4);
		l.add(5);
		l1.add(10);
		l1.add(11);
		l1.add(12);
		l1.add(14);
//		l.add("prajakta");
		System.out.println("L1 :" +l);
		System.out.println("L1 :"+l1);
		
		
		l1.addAll(l);
		System.out.println("l1 after addall: "+l1);
		
		
		l1.remove(1);
		System.out.println("l1 after remove from first index: "+l1);
		
		l1.add(2, 100);
		System.out.println("l1 After adding 100 to 2 position: "+l1);
		
		l1.removeAll(l);
		System.out.println("l1 After Remove all l:"+l1);
		
		
		
		System.out.println("Displaying Elements using for loop:");
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
		
		
		System.out.println("Displaying Elements using for each loop:");
		for(int i:l1)
		{
			System.out.println(i);
		}
		
		
	}
	public static void main(String[] args) {
		ArrListInt2 Arl1=new ArrListInt2();
		Arl1.makeList();
	}

}
