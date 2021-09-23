package com.collection;
import java.util.ArrayList;
public class ArrayList1 {
	ArrayList<String>l;
	ArrayList<String>l1;
	ArrayList<String>l2;//generic
//	ArrayList l;
	
	public ArrayList1()
	{
	
		l=new ArrayList<>();
		l1=new ArrayList<>();
		l2=new ArrayList<>();
		//non generic collection
//		System.out.println(l);
		
	}
	public void makelList()
	{
		l.add("Mr.x");
		l.add("mr.y");
		l.add("mr.x");
		l1.add("BBB");l1.add("ppp");
		l1.add(1, "prajakta");
		l1.addAll(1, l);
		l2.add("p");l2.add("q");l2.add("R");
		System.out.println("l2 size:"+l2.size());
		System.out.println("l1 is Empty:"+l1.isEmpty());
		System.out.println("index of q in l2: "+l2.indexOf("q"));
		System.out.println("l2 contains l1:"+l2.contains(l));
		System.out.println("L1: "+l1);
		System.out.println("L2 :"+l2);
		
//		l.add(123.6f);
//		l.add(23);
//		System.out.println("l:"+l);
//		System.out.println(l1);
		
		l1.addAll(l2);
		System.out.println("l1 after addall: "+l1);
		
//		l1.remove(3);
//		l1.remove("prajakta");
//		System.out.println("l1 After Remove index 3 and prajakta :"+l1);
		l1.removeAll(l2);
		System.out.println("l1 After Remove All: "+l1);
	
		l1.retainAll(l2);
		System.out.println("l1 After retain all:"+l1);
		
	
		
		System.out.println("Using for loop:");
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		System.out.print("Using for each Loop: ");
		for(String str : l1)
		{
			System.out.print(str);
			
		}
		
	}
	public static void main(String[] args) {
		ArrayList1 Al1=new ArrayList1()	;
		Al1.makelList();
				
	}
	

}
