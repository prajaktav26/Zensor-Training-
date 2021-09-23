import java.util.Scanner;
public class Check_Alpha_Numeric_SpecialChar{
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character ");
		char ch=sc.next().charAt(0);
		if ((ch>=65 && ch<=90)|| (ch>=97 && ch<=122 ))
		{
			System.out.println("Character");
		
		}
		else if (ch>= 48 && ch<= 57)
		{
            System.out.println(" Digit ");
		}
 
        // OTHERWISE SPECIAL CHARACTER
        else
            System.out.println(" Special Character ");
		
	}
	}