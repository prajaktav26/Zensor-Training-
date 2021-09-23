package com.collection.Comparable;

import java.util.ArrayList;

import com.collection.Employee;

public class Player1 implements Comparable<Player1>{
	int runs;
	String name;
	int id;
	public Player1(int r,String n,int i)
	{
		runs=r;
		name=n;
		id=i;
		
	}
	public String toString()
	{
		String str="Runs :"+runs+" Name: "+name+"id:"+id;
		return str;
	}
	
	public int compareTo(Player1 o1)
	{
		return this.name.compareTo(o1.name);
		
	}
//	public int CompareTo(Player1 o2)
//	{
//		if(this.runs>o2.runs)
//			return 1;
//		else if(this.runs<o2.runs)
//			return -1;
//		else
//		{
//			return o2.id-this.id;
//		
//		}
//	}
			
	
	

}
