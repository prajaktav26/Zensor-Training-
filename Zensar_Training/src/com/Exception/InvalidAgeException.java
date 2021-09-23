package com.Exception;

public class InvalidAgeException extends RuntimeException {
	
	
		String errmsg;
		public InvalidAgeException() {}
		public InvalidAgeException(String err)
		{
			//super(err);
			errmsg = err;
		}
		public void showError()
		{
			//System.out.println("Age is below range!!" );
			System.out.println(errmsg );
		}

}
