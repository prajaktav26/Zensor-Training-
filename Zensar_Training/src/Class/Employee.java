package Class;

public class Employee {
	private int EmpId;
	private String EmpName;
	private int Salary;
	
	public void setEmpId(int Id)
	{
		EmpId=Id;
	}
	public int getEmpId()
	{
		return EmpId;
		
	}
	public void setEmpName(String Name)
	{
		
		EmpName=Name;
	}
	public String getEmpName()
	{
		return EmpName;
	}
	public void setSalary(int s)
	{
		Salary=s;
	}
	public int getSalary()
	{
		return Salary;
	}
	
}
