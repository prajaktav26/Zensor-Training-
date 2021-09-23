package com.Strings;

public class EqaulsMethod {
	public static void main(String[] args) {

	    // create 3 strings
	    String first = "java programming";
	    String second = "java programming";
	    String third = "python programming";
	    String fourth=new String("java programming");
	    String fifth=new String ("java programming");

	    // compare first and second strings
	    //eqauls method compares data
	    boolean result1 = first.equals(second);
	    System.out.println("Strings first and second are equal: " + result1);//true

	    // compare first and third strings
	    boolean result2 = first.equals(third);
	    System.out.println("Strings first and third are equal: " + result2);//false
	    
	    
	    //==compares memory location
	    boolean result3=first==second;
	    System.out.println(result3);//true
	    
	   boolean result4=first==fourth;//false
	   System.out.println(result4);
	   
	   boolean result5=fourth==fifth;
	   System.out.println(result5);
	   
	   
	   
	    
	    
	  }

}
