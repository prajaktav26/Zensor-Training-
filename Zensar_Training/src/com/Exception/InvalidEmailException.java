package com.Exception;

public class InvalidEmailException extends RuntimeException {
	String errmsg;
	public InvalidEmailException() {}
	public InvalidEmailException(String err)
	{
		errmsg=err;
	}
public void showError()
{
	System.out.println("Invalid email");
}
}
