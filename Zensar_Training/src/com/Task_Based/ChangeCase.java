package com.Task_Based;

public class ChangeCase {
	public static void main(String[] args) {
		String str="ZenSar";
		StringBuffer newstr=new StringBuffer(str);
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
					{
				
				newstr.setCharAt(i, Character.toUpperCase(str.charAt(i)));  
					}
			else if(Character.isUpperCase(str.charAt(i)))
			{
				newstr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
			
		}
		System.out.println(newstr);
	}

}
