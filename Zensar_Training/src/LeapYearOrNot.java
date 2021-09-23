import java.util.Scanner;
public class LeapYearOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
        int Year=sc.nextInt();
        boolean flag = false;
        if(Year%4==0)
        {
        	flag=true;
        }
        else if(Year%100==0)
        {
        	flag=false;
        }
        else if(Year%400==0)
        {
        	flag=true;
        }
        if(flag)
        {
        	System.out.println("the year is leap year");
        }
        else
        {
        	System.out.println("The year is not a leap year");
        }
		
		
	}

}
