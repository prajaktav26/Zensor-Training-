package com.collection.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public class Magezine implements Comparable<Magezine> {
	int mid;
	String mName;
	String editor;
	float cost;
	public int compareTo(Magezine m)
	{
		float diff =m.cost-this.cost;
		return (int)diff;
	}
	public Magezine() {}
	public Magezine(int x,String y,String e, float c)  
	{
		mid=x ; mName = y; editor=e; cost=c;
	}
	public String toString()
	{
		return mid + "-"+mName+"-"+editor + "-"+cost;
	}
	public int hashCode()
	{
		final int ans;
		ans = mid +mName.hashCode();
		return ans;
	}
	public boolean equals(Object o)
	{
		if(o==null) return false;
		if(this==o) return true;
		if(this.getClass()!= o.getClass()) return false;
		Magezine mo = (Magezine)o;
		if(this.mid==mo.mid && this.mName.equals(mo.mName) && this.editor.equals(mo.editor )
				&& this.cost == mo.cost)
			return true;
		else
			return false;
	}
	
}
class ByCostComparator implements Comparator<Magezine>
{
	public int compare(Magezine m1, Magezine m2)
	{
		float diff =m2.cost-m1.cost;
		return (int)diff;
	}
}