package Array;

import java.util.Scanner;

public class ModularArray {
	Scanner sc = new Scanner(System.in);
	int a[], avg;

	ModularArray() {
		a = new int[5];
	}

	public void acceptElements() {
		System.out.println("Enter the elements: ");
		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();
		}
	}

	public void showelements() {
		for(int val:a) {                              //using for each loop
			System.out.println(val);
		}
	}

	public void average() {
		for (int i = 0; i < a.length; i++) {

			avg = a[i] + avg;

		}
		avg = avg / a.length;

		System.out.println("Average of elments: " + avg);
	}

	public void evenElements() {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println("EvenNumber are even: " + a[i]);

			}
		}
	}	
	 public void index()
	 {
		  for(int i=0;i<a.length;i++)
		  {
			  if(i%2==1)
			  {
				  System.out.println("index at odd elemeents are:"+a[i]);
			  }
		  }
	  

	}

	public void OddElementsSum() {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2 != 0) {
				sum = sum + a[i];
			}
			
		}
		System.out.println("odd number sum is:" + sum);

	}

	public void reverseArray() {

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println("Reverse: " + a[i]);
		}
	}

	public static void main(String[] args) {
		ModularArray ac = new ModularArray();
		ac.acceptElements();
		ac.showelements();
		ac.average();
		ac.reverseArray();
		ac.evenElements();
		ac.OddElementsSum();
		ac.index();
	}

}


