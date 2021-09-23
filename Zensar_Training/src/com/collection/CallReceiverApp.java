package com.collection;
import java.util.ArrayList;
public class CallReceiverApp {
	ArrayList<String>l=new ArrayList<>();
	ArrayList<Integer>l1=new ArrayList<>();
	ArrayList l2=new ArrayList();
	public CallReceiverApp()
	{
		System.out.println(l);
	}
	public void makeList()
	{
		l2.add(12);
		l2.add("prajakta");
		l2.add("kavita");
		l2.add(60);
		l2.add(69);
		System.out.println(l2);
		for(Object o:l2)
		{
			if(o instanceof String)
				l.add((String)o);
			else if(o instanceof Integer)
				l1.add((Integer)o);
		}
		System.out.println("l:"+l);
		System.out.println("l1:"+l1);
			
			
		}
	public void minElement(ArrayList<Integer>list)
	{
		int min=list.get(0);
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)<min)
			{
				min=list.get(i);
			}
			
			}
		System.out.println("minimum of all elements:"+min);
		}
		
	
	public static void main(String[] args) {
		CallReceiverApp c=new CallReceiverApp();
		c.makeList();
		c.minElement(c.l1);
	}

}
