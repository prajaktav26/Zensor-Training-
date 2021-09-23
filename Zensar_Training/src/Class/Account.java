package Class;
import java.util.Scanner;

public class Account {

	 private double balance;
	 String Name;
	 String AccNo;
	 
	
	Scanner sc=new Scanner(System.in);
	
	
	
public Account() 
{
	//Default contructor
	
	Name="Prajakta";
	AccNo="7865275";
	balance=0;
	
	
}

Account(String s,String st){  
	//parameterized Constructor
	//we can explicitly assign values to object using parameterized constructor
	Name=s;
	AccNo=st;
	
	

    }  

public void insert(String N,String AcN,double B)
{
	Name=N;
	AccNo=AcN;
	balance=B;
	
}

public void display() {
	System.out.println("Name of Account Holder is :"+Name);
    System.out.println("Account Number is "+AccNo);
//    System.out.println("Balance is "+balance);
}


public void Deposit(double Amt)
{
	
	this.balance = balance+Amt;
	
}
public void withdraw()
{
	System.out.println("Enter How Much Amount You Want to Withdraw");
	double Amt=sc.nextDouble();
	
	balance=balance-Amt;
	System.out.println("Transaction Completed Successfully");
}


public void getBalance()
{
	System.out.println("Available Balance"+balance);
	
}
	
}

