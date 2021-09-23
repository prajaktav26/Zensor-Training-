package com.collection.Comparable;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

public class CricketPlayer2 {
	void display(ArrayList<CricketPlayer> l)
	{
		Iterator<CricketPlayer> itr=l.iterator();
		while(itr.hasNext())
		{
			CricketPlayer c=itr.next();
			System.out.println(c);
			
		}
		
		
	}
	public static void main(String[] args) {
		ArrayList<CricketPlayer> al=new ArrayList<>();
		al.add(new CricketPlayer(2000,"Sachin",1));
		al.add(new CricketPlayer(200,"yuvi",2));
		al.add(new CricketPlayer(100,"Rohit",3));
		al.add(new CricketPlayer(1000,"Dhoni",4));
		al.add(new CricketPlayer(1500,"Virat",5));
		CricketPlayer2 c2=new CricketPlayer2();
//		Collections.sort(al,new byNameComparator());
//		System.out.println("using comparator...... by name");
//		System.out.println(al);
		Collections.sort(al,new byRunComparator());
		System.out.println("using comparator...........by runs");
		System.out.println(al);
		

}
}
