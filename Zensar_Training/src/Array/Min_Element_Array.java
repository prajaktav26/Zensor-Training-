package Array;
import java.util.Scanner;
public class Min_Element_Array {
	
	// Java Program to find the minimum element in each row of a matrix
	public static void main(String[] args) {
		int num[][];
		Scanner sc=new Scanner(System.in);
		System.out.println("How Much Rows You want:");
		int rows=sc.nextInt();
		for(int i=0;i<rows;i++)
		{
			System.out.println("How Many Columns in the Row :"+i+1);
			

		
//		num[i][j]=new int[];
		int cols=sc.nextInt();
		for(int j=0;j<cols;j++)
		{
			num[i][j]=sc.nextInt();
		}
		
		System.out.println("array Elements Are:");
		for(i=0;i<num.length;i++)
		{
			for(j=0;j<num[i].length)
		}
		
		
	}

	
}