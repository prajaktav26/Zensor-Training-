package com.Innerclass;

public class Society {
	String name;
	int regNo;
	Society()
	{
		
	}
	public Society(String n,int rn) {
		name=n;
		regNo=rn;
		
	}
	public void showSocietyDetails()
	{
		System.out.println("society Name is : "+name+" Reg No is : "+regNo);
	}
     class Flat{
		int flatNo;
		String flatArea;
		String ownerName;
		Flat()
		{
			
		}
		Flat(int fn,String s1,String s2)
		{
			flatNo=fn;
			flatArea=s1;
			ownerName=s2;
			
			
		}
		public void showFlatDetails()
		{
			System.out.println("Flat Number is: "+ flatNo +" Flat Area is: " + flatArea+" Owner Name is: "+ownerName);
		showSocietyDetails();
		}
		
	}
	public static void main(String[] args) {
		Society.Flat f=new Society().new Flat();
		f.showFlatDetails();
		
	}

}
