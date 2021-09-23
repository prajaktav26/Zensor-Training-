import java.util.Scanner;
public class Gross_Salary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basic Salary");
		float Basic_Salary=sc.nextFloat();
		if(Basic_Salary<=10000)
		{
			
			float HRA=0.2F*Basic_Salary;
			float DA=0.8F*Basic_Salary;
			float Gross_Salary=HRA+DA+Basic_Salary;
			System.out.println("Gross Salary : "+Gross_Salary);
		}
		else if(Basic_Salary<=20000)
		{
			
			float HRA=0.25F*Basic_Salary;
			float DA=0.9F*Basic_Salary;
			float Gross_Salary=HRA+DA+Basic_Salary;
			System.out.println("Gross Salary : "+Gross_Salary);
		}
		
		else if(Basic_Salary>20000)
		{
			
			float HRA=0.3F*Basic_Salary;
			float DA=0.95F*Basic_Salary;
			float Gross_Salary=HRA+DA+Basic_Salary;
			System.out.println("Gross Salary : "+Gross_Salary);
		}
	}
}
