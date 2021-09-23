package Inheritance;

public class SingleInheritance2 extends SingleInheritance1 {
	int id;
	float Salary;
	public SingleInheritance2() {
		id=2;
		Salary=100;
		System.out.println("we are in default constructor of singleinh2");


	}
	public SingleInheritance2(int i,float s)
	{
		id=i;
		Salary=s;
		System.out.println("we are in Parameterize Constructor singleinh2");
	}
	public void showDetails2()
	{
		System.out.println("Id : "+id+" Salary : "+Salary);
		
	}
	public static void main(String[] args) {
		SingleInheritance2 SI2=new SingleInheritance2();
//		SI2.showDetails1();
//		SI2.showDetails2();
	}
	

}
