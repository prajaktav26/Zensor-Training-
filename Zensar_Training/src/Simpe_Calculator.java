import java.util.Scanner;
public class Simpe_Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
		
		System.out.println("Enter Choice + , - , / , *");
		char ch=sc.next().charAt(0);
		
		
		if(ch=='+')
		{
			System.out.println(a+b);
		}
		else if(ch=='-')
		{
			System.out.println(a-b);
		}
		else if(ch=='/')
		{
			System.out.println(a*b);
		}
		else if(ch=='*')
		{
			System.out.println(a/b);
		}
			
		}
    		  
}
