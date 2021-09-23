package com.thread;

public class Thread1 implements Runable{
	
	String[] a= {"ssdf","ppdfgh"};
	for(String s:a)
	{
		System.out.println(s);
	}
	
public static void main(String[] args) {
	Runnable r=new Thread1();
	Thread t=new Thread();
	t.start();
}
}
