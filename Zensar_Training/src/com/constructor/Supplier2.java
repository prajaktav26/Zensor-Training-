package com.constructor;

public class Supplier2 {
	int itemId;
	String itemName;
	Supplier sup;
	public void setSup(Supplier s)
	{
		sup=s;
	}
	public Supplier getSup()
	{
		return sup;
	}
	Supplier2()
	{
		
	}
	
	Supplier2(int i,String n,Supplier sp)
	{
		itemId=i;
		itemName=n;
		sup=sp;
		
		
		
	}
	void showDtails()
	{
		System.out.println("Item no: "+itemId+"item Name"+itemName);
		sup.show();
		
	}
	public static void main(String[] args) {
		Supplier s1=new Supplier(1,"mahesh","988643572");
		Supplier2 s2=new Supplier2(1,"laptop",s1);//Agregation
//		s1.show();
		s2.showDtails();
	}

}
