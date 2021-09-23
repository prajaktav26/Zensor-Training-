package com.Exception;
import java.util.Scanner;
public class ValoidateVoter {

		public void checkEligibility(int age) //throws InvalidAgeException
		{
			try
			{
			if(age<18)
				throw new InvalidAgeException("Age can not be minor");
			else
				System.out.println("Volter is eligible to vote");
			}
			catch(InvalidAgeException e)
			{
				System.out.println("Im iin Catch block");
				e.showError();
			}
			
		}
		
		public void acceptAge()  //throws InvalidAgeException
		{
			//try
			//{
			System.out.println("Enter Voter age :");
			int a = new Scanner(System.in).nextInt();
			checkEligibility(a);
			/*}
			catch(InvalidAgeException e)
			{
				e.showError();
			}*/
		}
		
		public static void main(String[] args) //throws InvalidAgeException
		{
			ValoidateVoter v = new ValoidateVoter();
			v.acceptAge();
			
		//Candidate c1 = new Candidate(33,"Ganesh");
		//Candidate c2 = new Candidate(33,"Ganesh");
		///Candidate c2 =null;
		
		//System.out.println(c1==c2);
		
		//System.out.println(c1.equals(c2));
		/*String s="AN,45 dfd!23";
		String word ="";
		
		char[] ch = s.toCharArray();
		boolean flag=false;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]== 32 || ch[i]==',' || ch[i]=='!' )
			{
			   flag=true;
			}
			else
			{
				word+=ch[i];
			}
			if(flag==true || i==ch.length-1)
			{
				System.out.println(word);
				word="";
				flag=false;
			}
		}*/
		
		
		
		/*String []words =  s.split("[ ,!?:]");
		System.out.println(Arrays.toString(words));
		System.out.println("Enter Password...");
		String pass = new Scanner(System.in).next();
		if(pass.matches("[a-zA-Z0-9@#][A-Z]+[a-zA-Z0-9@#]{8,15}"))
			System.out.println("Valid Password");
		else
			System.out.println("InValid Password");*/
		/*int sum=0;
		for(char c : s.toCharArray())
		{
			if(c>= '0' && c<= '9')
			{
				sum+= Character.getNumericValue(c);
			}
		}
		System.out.println(sum);*/
		
		}

	}
	class Candidate
	{
		public boolean equals(Object o)
		{
			if(this==o) return true;
			if(o==null) return false;
			if(this.getClass() != o.getClass()) return false;
			Candidate c = (Candidate)o ;
			if(this.cid==c.cid && this.cName.equals(c.cName))
				return true;
			return false;
		}
		int cid;
		String cName;
		@Override
		public String toString() {
			return "Candidate [cid=" + cid + ", cName=" + cName + "]";
		}
		public Candidate(int cid, String cName) {
			super();
			this.cid = cid;
			this.cName = cName;
		}
		
	}
	class Item
	{
		
	}

