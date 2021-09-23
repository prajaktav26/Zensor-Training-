package com.constructor;

public class Address {
	int srNo,pin;
	String soci,city;
	Address()
	{
		
	}
	public Address(int a,int b,String s,String c)
	{
		System.out.println("parameter constructor of Address");
		srNo=a;
		pin=b;
		soci=s;
		city=c;
	}
	public void show()
	{
		System.out.println("srNo: "+srNo+"pin: "+pin+"soci: "+soci+"city: "+city);
	}

}
