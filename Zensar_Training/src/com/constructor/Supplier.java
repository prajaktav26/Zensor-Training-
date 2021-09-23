package com.constructor;

public class Supplier {
	int id;
	String Name;
	String MobileNo;
	public Supplier() {
		// TODO Auto-generated constructor stub
	}
	public Supplier(int i,String s2,String s3)
	{
	id=i;
	Name=s2;
	MobileNo=s3;
	
	}
	void show()
	{
		System.out.println(" id : "+id+" Name: "+Name+" Mobile Number: "+MobileNo);
	}
	
	
	

}
