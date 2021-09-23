package com.constructor;

public class Containment {
	public static void main(String[] args) {
		//containment through aggregation
		Constructor_Chaining chaining=new Constructor_Chaining("adr567883", "prajaktakakade","89876532", 
				new Address(1,2,"kiran","nagpur"));
		chaining.showDetail();
	}

}
