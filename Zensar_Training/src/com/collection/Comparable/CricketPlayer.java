package com.collection.Comparable;
import java.util.ArrayList;
import java.util.Comparator;

import com.collection.Employee;
public class CricketPlayer {
	int runs;
	String name;
	int id;
	public CricketPlayer(int r,String n,int i)
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
	
	
}

//class byNameComparator implements Comparator<CricketPlayer>
//{
//	public int compare(CricketPlayer o1, CricketPlayer o2) {
//		
//		return o1.name.compareTo(o2.name);
//	}
//	
//}
class byRunComparator implements Comparator<CricketPlayer>
{
	

	@Override
	public int compare(CricketPlayer o1, CricketPlayer o2) {
		// TODO Auto-generated method stub
		return o2.runs-o1.runs;
	}
}