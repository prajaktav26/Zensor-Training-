package com.Task_Based;

public class WordOccurence {
	static int countWordOccurence (String str,String word)
	{
		String a[] =str.split(" ");
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(word.equals(a[i]))
			{
				count++;
			}
			
		}
		return count;
		
		
	}
	public static void main(String[] args) {
		String str="Good morning good  morning ";
		String word="morning";
		System.out.println(countWordOccurence(str, word));
	}

}
