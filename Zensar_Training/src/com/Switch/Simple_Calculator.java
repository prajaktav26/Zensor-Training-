package com.Switch;
import java.util.Scanner;

public class Simple_Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int Num1=sc.nextInt();
		System.out.println("Enter Second Number:");
		int Num2=sc.nextInt();
		System.out.println("Enter choice: + - / *");
		char Choice=sc.next().charAt(0);
		switch (Choice) {
		case '+' :
			int Sum=Num1+Num2;
			System.out.println("sum:"+Sum);
			break;
		case '-' :
			int Sub=Num1-Num2;
			System.out.println("sub:"+Sub);
			break;
		case '/' :
			float Div=Num1/Num2;
			System.out.println("Div:"+Div);
			break;
		case '*' :
			int Mul=Num1*Num2;
			System.out.println("Mul:"+Mul);
			break;
		default:
			System.out.println("Invalid Input");
		}
		
	}
}
