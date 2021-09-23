package com.collection;

public class Employeee {
	private String name;
    private String account;
    private Integer salary;
 
    public Employeee(String name, String account, Integer salary) {
        super();
        this.name = name;
        this.account = account;
        this.salary = salary;
    }
    public String toString()
    {
    	return "name : "+name+" |account : "+this.account+" |Salary : "+this.salary;
    	
    	
    }
    public void setName(String s)
    {
    	name=s;
    
    }
    public String getName()
    {
    	return name;
    }
    public void setAccount(String acc)
    {
    	account=acc;
    }
    public String getAccount()
    {
    	return account;
    }
    public void setSalary(int n)
    {
    	salary=n;
    }
    public int getSalary()
    {
    	return salary;
    }
}
