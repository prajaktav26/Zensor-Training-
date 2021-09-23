package com.constructor;

public class Constructor_Chaining {
	private String AdharNo;
	private String Name,Mobile;
    private int age; 
    Address adr;
    public void setAdr(Address ad)
    {
    	//containment
    	adr=ad;
    }
    public Address getAdr()
    {
    	return adr;
    }
 Constructor_Chaining() {
	 //this has to be the very first statement in the constructor
		this("adh345678","Prajakta","8947532171");
		age=90;
		
		
	}
Constructor_Chaining(String s1,String s2,String s3)
{
	this("pr23ip0987","riya");
	Mobile=s3;
	
}
Constructor_Chaining(String s1,String s2)
{
	//chaining
	AdharNo=s1;
	Name=s2;
	
}
Constructor_Chaining(String s1,String s2,String s3,Address ar)
{
	AdharNo=s1;
	Name=s2;
	Mobile=s3;
	adr=ar;
	
	
}
public void showDetail()
{
	System.out.println("AdharNo"+AdharNo+"Name="+Name+"Mobile="+Mobile);
	//containment
	adr.show();
}
public static void main(String[] args) {
	Constructor_Chaining c=new Constructor_Chaining(null, null, null);
	Constructor_Chaining c1=new Constructor_Chaining();
	Constructor_Chaining c2=new Constructor_Chaining("89921yuii","priya");
	//containmnet
	Address a=new Address(1,3,"vikas ","pune ");
	c.setAdr(a);
	c.getAdr();
	c.showDetail();
	

	

	
//	System.out.println(c2.Mobile);
//	System.out.println(c2.Name);
}
}
