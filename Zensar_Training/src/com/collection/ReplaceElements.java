package com.collection;
import java.util.ArrayList;
public class ReplaceElements {

	public void replaceElements(ArrayList<String> l)
	{
		l.add("ketan");
		l.add("vikas");
		l.add("prajakta");
		l.add("priya");
		l.add("Ankita");
		l.add("snehal");
		System.out.println("Before Replacement: "+l);
		l.set(1, "prajakta");
		System.out.println("After Replacement:"+l);
		
	}
public static void main(String[] args) {
	ArrayList<String> al =new ArrayList<>(); 
	ReplaceElements RE=new ReplaceElements();
	RE.replaceElements(al);
}
}
