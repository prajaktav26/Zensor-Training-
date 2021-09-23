package com.collection.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Player2 {
	void display(ArrayList<Player1> l)
	{
		System.out.println("Uisng Iterator..........");
		Iterator<Player1> itr=l.iterator();
		while(itr.hasNext())
		{
			Player1 p1=itr.next();
			System.out.println(p1);
		}
		
	}
	public static void main(String[] args) {
		ArrayList<Player1> al=new ArrayList<>();
		al.add(new Player1(2000,"Sachin",1));
		al.add(new Player1(200,"yuvi",2));
		al.add(new Player1(100,"Rohit",3));
		al.add(new Player1(1000,"Dhoni",4));
		al.add(new Player1(1500,"Virat",5));
		Player2 p2=new Player2();
		p2.display(al);
		Collections.sort(al);
		System.out.println("After sorting by Name using Comparable:"+al);
		
	}

}
