package Class;

public class Professor {
	public String empName;
	public int empSalary;
	public String address;
	
	public Professor() {
		this("Balaji");
		System.out.println("defult construtor called.....");
	}

	public Professor(String empName ) {
		this(empName, 34345);
	
		System.out.println("single paramter construtor called....."+ empName);
		
	}
	public Professor(String s1,String s2)
	{
		
	}
	
	public Professor(String empName, int empSalary) {
		this(empName, empSalary, "pune");
		System.out.println("two paramter construtor called.....");
		
	}


	public Professor(String empName, int empSalary, String address) {
		this.empName = empName;
		this.empSalary = empSalary;
		this.address = address;
		System.out.println("three paramter construtor called.....");
	}
	


	void display() {
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + empSalary);
		System.out.println("Employee Address: " + address);
	}

	public static void main(String[] args) {
		Professor p = new Professor();
		p.display();
	}

}
