package com.Strings;
import java.util.Scanner;
public class LongestWord {
	public static int longestWord(String str)
	{
		String words[]=str.split(" ");
		int len=0;
		for(String w:words)
		{
			if(len<w.length())
			{
				len=w.length();
			}
		}
		return len;
		
	}
	public static void main(String[] args) {
		
	String str="I am prajakta kakade";
	System.out.println(longestWord(str));
	

}
}
