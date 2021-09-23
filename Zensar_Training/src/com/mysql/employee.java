package com.mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;


public class employee {
	public static final String JDBC_DRIVER ="com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL="jdbc:mysql://localhost/hrmanagement";
	public static final String USER="root";
	public static final String PASS="P1234";
	static Connection con=null;
	
	public static Connection getConnection()
	{
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Driver Loaded");
			System.out.println("Connecting to Database");
			con=DriverManager.getConnection(JDBC_URL, USER, PASS);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	
	public static void main(String[] args) {
		Connection con=employee.getConnection();
		if(con!=null)
			System.out.println("Connected to mysql successfully...");
		else
			System.out.println("not connected");
	}
	
	

}
