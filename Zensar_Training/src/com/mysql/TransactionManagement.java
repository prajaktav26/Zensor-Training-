package com.mysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

public class TransactionManagement {

	static Statement st; 
	static ResultSet rs; static ResultSet rs1;
	static Connection con;
	static PreparedStatement pst;
	public void accessDB() throws SQLException
	{
		st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		rs = st.executeQuery("select * from employee");
		System.out.println("EmpID"+"\t"+"Emp Name"+"\t\t"+"Department"+"\t\t"+"Gender"+"\t\t"+"EMpSalary");
		while(rs.next())
		{
			int id = rs.getInt(1);
			String n = rs.getString(2);
			int did = rs.getInt(3);
			char gen = rs.getString(4).charAt(0);
			float sal = rs.getFloat(5);
			System.out.println(id+"\t\t"+n+"\t\t"+did+"\t\t"+gen+"\t"+sal);
			
		}
	}
	public void insertRecord(int i,String n,int did,char gen,float s,String d) throws SQLException
	{
		pst = con.prepareStatement("insert into employee"
				+ " values(?,?,?,?,?,?)");
		pst.setInt(1,i);
		pst.setString(2, n);
		pst.setFloat(5, s);
		pst.setString(4, gen+"");
		pst.setInt(3,did);
		pst.setString(6,d);
				
		int r = pst.executeUpdate();
		System.out.println("Number of rows inserted : " + r);
			
	}
	public void deleteRecord(int empid) throws SQLException
	{
		pst  =  con.prepareStatement("delete from employee"
				+ " where empid = ?");
		pst.setInt(1,empid);
		int r = pst.executeUpdate();
		System.out.println("Number of rows deleted : " + r);
	
	}
	
	public void doOperation() 
	{
		Savepoint s1Savepoint=null;
		try
		{
			con.setAutoCommit(false);   //transactiion started
			deleteRecord(300);
			insertRecord(3001,"Moiz",115,'m',85900,"2021-12-05");
			deleteRecord(301);
			s1Savepoint = con.setSavepoint("MySavePoint");
			insertRecord(5001,"Moiz",115,'m',85900,"2021-12-05");
			deleteRecord(6000);
			insertRecord(6001,"Moiz",115,'m',85900,"2021-12-05");
		    con.commit();  // transaction end
			System.out.println("Chages updated permenantly.");
		}
		catch(SQLException e)
		{
			try {
				System.out.println("Rolling back transaction ");
				System.out.println("Reason is : " + e.getMessage());
				//con.rollback();  // transactiion end
				con.rollback(s1Savepoint);
			} catch (SQLException e1) {
				
				e1.printStackTrace();
				System.out.println("Sorry, transaction rolled back");
			}
			
		}
		
	}
	
	public static void main(String[] args) throws SQLException {
		TransactionManagement  o = new TransactionManagement();
		con = DBConnection.getConnection();
         
         
		try {
		
			o.accessDB();
			System.out.println("______________________________________________________");
			
			//o.insertRecord(1300,"Ganesh",67000,"Production");
			//System.out.println("______________________________________________________");
		//	o.deleteRecord();
			//System.out.println("______________________________________________________");
			o.doOperation();
			o.accessDB();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			con.close();
		}

	}

}
