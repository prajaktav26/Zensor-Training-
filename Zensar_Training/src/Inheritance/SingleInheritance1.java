package Inheritance;


public class SingleInheritance1 {
	String name;
	String designation;

	public SingleInheritance1() {

		name = "prajakta";
		designation = "Software Engineer";
		System.out.println("we are in default constructor of singleinh1");

	}
	public SingleInheritance1(String s1,String s2) {
		name=s1;
		designation=s2;
		System.out.println("we are in Parameterize Constructor singleinh1");

	}
	public void showDetails1()
	{
		System.out.println("Name: "+name+" Designation: "+designation);
	}

}
