import java.util.Scanner;
public class Check_Vowel_Or_Consonant {
	public static void main(String[] args) {
		

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Character:");
	char ch=sc.next().charAt(0);
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
	{
		System.out.println(ch+" Is a Vowel");
	}
	else
	{
		System.out.println(ch+" Is a Consonant");
	}
	}
	
	

}
