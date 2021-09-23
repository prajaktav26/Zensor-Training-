package Array;
import java.util.Scanner;

public class Arrays {
	int a[]=new int[5];
	int i,sum=0;
	Scanner sc=new Scanner(System.in);
	
     public void getElements() {
    	
    	 System.out.println("Enter The Elements of The Array:");
   
    	 for(i=0;i<a.length;i++)
    	 {
    		 
    		 a[i]=sc.nextInt();
    		 
    	 }
     }
     public void evenNumber() {
    	 System.out.println("Even Numbers in Arrays:");
    	 for(i=0;i<a.length;i++)
    	 {
    		 
    		 if(a[i]%2==0)
    		 {
    			 System.out.println(a[i]);
    		 }
    		 
    	 }
     }
     public void OddNumber() {
    	 for(i=0;i<a.length;i++)
    	 {
    		 if(a[i]%2!=0)
    		 {
    			 System.out.println("Odd Numbers are "+a[i]);
    			 
    		 }
    	 }
     }
     public void OddPosition()
     
     {
		 System.out.println("Odd Position Elements Are");

    	 for(i=0;i<a.length;i=i+2)
    	 {
    		 System.out.println(a[i]);
    	 }
     }
     public void Sum_Odd()
     {
    	 for(i=0;i<a.length;i++)
    	 {
    	 if(a[i]%2!=0)
    	 {
    		  sum=sum+a[i];
    	 }
    	 }
    	 System.out.println("Sum odd Number position Elements "+sum);
     }
     public static void main(String[] args) {
		Arrays a1=new Arrays();
		a1.getElements();
		a1.Sum_Odd();
//		a1.evenNumber();
//		a1.OddPosition();
//		a1.OddNumber();
	}
	
    	 
}
