import java.util.Scanner;
public class Bank {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount");
		int Amount=sc.nextInt();
		int a[]= {2000,500,100,50,20,10,52,1};
		int i,t,p;
		p=Amount;
		for(i=0;i<a.length;i++)
		{
			 t=Amount/a[i];
		
	
		if(t!=0)
		{
			System.out.println(a[i]+"x"+t+"="+(t*a[i]));
			Amount=Amount%a[i];
		}
		}
		
	}
	
	
	

}
