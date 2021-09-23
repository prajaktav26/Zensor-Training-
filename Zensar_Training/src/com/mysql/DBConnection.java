package com.mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	   // public static final String JDBC_URL = "jdbc:mysql://localhost/library";
	  public static final String JDBC_URL = "jdbc:mysql://localhost/hrmanagement"; 
	    // Database credentials
	    public static final String USER = "root";
	    public static final String PASS = "P1234";
	   static Connection conn = null;
	    
	    public static Connection getConnection()
	    {
	    	try {
				// STEP 2: Register JDBC driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver Loaded...");
				// STEP 3: Open a connection
				System.out.println("Connecting to database...");
				conn = DriverManager.getConnection(	JDBC_URL,	USER,	PASS);
				
			}
				catch(Exception e)
			{
				e.printStackTrace();
			}
	    	return conn;
		
	    }
	    
		public static void main(String[] args)
		{		
				Connection con = DBConnection.getConnection();
				if(con!=null)
				System.out.println("COnnected to MySQL successfully ...");
				else
					System.out.println("Not COnnected to MySQL successfully ...");
		}
	}


