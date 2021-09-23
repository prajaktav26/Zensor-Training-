import java.util.Scanner;
public class Three_Digit_Number_Check {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		
		
	
		if(num>99 && num<1000)
		{
			
			
			System.out.println("This is a Three Digit Number");
			
			int First_Digit=num%10;
			int LastDigit=num/100;
			int Sum_First_Third_No=First_Digit+LastDigit;
			
			System.out.println("Sum of First and Third Digit of "+num+" : "+Sum_First_Third_No);
			
			
			
		}
		else
		{
			System.out.println("This is not a Three Digit Number");
		}
	}

}
