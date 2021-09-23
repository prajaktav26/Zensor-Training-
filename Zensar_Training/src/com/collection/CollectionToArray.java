package com.collection;
import java.util.ArrayList;
public class CollectionToArray {
	
	
	public void makelist(ArrayList<String>list)
	{
		list.add("prajakta ");
        list.add("priyanka ");
        list.add("gita ");
        list.add("anisha ");
        list.add("ankita");
        list.add("priya");
 
        // Converting list to an array
        String[] str = list.toArray(new String[0]);
 
        // Iterating over elements of array
        for (int i = 0; i < str.length; i++) {
            String data = str[i];
 
            // Printing elements of an array
            System.out.print(data);
        }
	}
	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        CollectionToArray ca=new CollectionToArray();
        ca.makelist(list);
      
	}
 
}