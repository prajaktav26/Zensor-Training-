package com.mysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.sql.CallableStatement;

import java.sql.ResultSetMetaData;

public class ResultSetTypes {
	Connection con;                                                  
	ResultSet rs;
	Statement st;
	PreparedStatement pst;
	
	public ResultSetTypes() throws SQLException
	{
	
		con = DBConnection.getConnection();
		
		st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		rs = st.executeQuery("select * from employee");
	}
	//scrollable?Y Forward only  
	public void empployeeDetails() throws SQLException
	{
		rs.beforeFirst();
		System.out.println("__________________________________________________");
		System.out.println("Emp ID" +"\t"+"Name"+"\t\t"+"Dept ID"+"\t\tSalary");
		System.out.println("__________________________________________________");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getInt(3)+"\t\t"+rs.getFloat(5));
		}
		
		
	}
	public void empDetailsReverseOrder() throws SQLException
	{
		System.out.println("__________________________________________________");
		System.out.println("Emp ID" +"\t"+"Name"+"\t\t"+"Dept ID"+"\t\tSalary");
		System.out.println("__________________________________________________");
		rs.afterLast();
		//rs.last();
		while(rs.previous())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getInt(3)+"\t\t"+rs.getFloat(5));
		}
		
		
	}
	public void firsAndLastRecord()
	{
		System.out.println("__________________________________________________");
		System.out.println("Emp ID" +"\t"+"Name"+"\t\t"+"Dept ID"+"\t\tSalary");
		System.out.println("__________________________________________________");
		try {
			rs.first();
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getInt(3)+"\t\t"+rs.getFloat(5));
			//rs.afterLast();
			//rs.previous();
			rs.last();
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getInt(3)+"\t\t"+rs.getFloat(5));
			
			
			
			
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void salaryRevision(int eid)
	{
		try {
			//rs = st.executeQuery("select empid,ename,salary from employee where empid=300");
			rs.beforeFirst();
			while (rs.next())
			{
				if(rs.getInt(1)==eid)
				{
				rs.updateFloat(5, 50000);
				rs.updateString(2, "Chirag");
				rs.updateRow();
				System.out.println("Record Updated");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void removeRecord(int recno)
	{
		try {
			
			rs.absolute(recno);
			rs.deleteRow();
			
			System.out.println("Record deleted successfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void insertNewRecord()
	{
		try {
			rs.moveToInsertRow();
			rs.updateInt(1,1193);
			rs.updateString(2, "Vinita");
			rs.updateInt(3, 114);
			rs.updateString(4, "f");
			rs.updateFloat(5, 80000);
			rs.insertRow();
			System.out.println("New Row addedd !");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getResultSetInfo()
	{
		try {
			rs = st.executeQuery("select * from employee");
			ResultSetMetaData rsmd =   rs.getMetaData();
			int ccnt = rsmd.getColumnCount();
			for(int i=1;i<=ccnt;i++)
			{
			System.out.println("Column Name : " +rsmd.getColumnName(i) + "  and Type is :  "
			+rsmd.getColumnType(i) + " , Type Name : " + rsmd.getColumnTypeName(i) );
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
	}
	public void getDocDetails(int pid) throws SQLException
	{
		CallableStatement cst= con.prepareCall("{ call fetchPatient_DoctDetails(?,?,?) }");
		cst.setInt(1, pid);
		cst.registerOutParameter(2, Types.VARCHAR);
		cst.registerOutParameter(3, Types.VARCHAR);
		boolean flag = cst.execute();
		if(flag==false)
			System.out.println("Patinet name : "+ cst.getString(2));
		System.out.println("Doc name : "+ cst.getString(3));
	}
	public void getDepartment(int eid) throws SQLException
	{
		CallableStatement cst= con.prepareCall("{ ? = call getdepartment(?) }");
		cst.setInt(2, eid);
		cst.registerOutParameter(1, Types.VARCHAR);
		
		boolean flag = cst.execute();
		if(flag==false)
			System.out.println("Department name : "+ cst.getString(1));
		
	}
	
	public static void main(String[] args) throws SQLException
	{
	
		ResultSetTypes obj = new ResultSetTypes();
		obj.empployeeDetails();
		obj.empDetailsReverseOrder();
		obj.firsAndLastRecord();
	//	obj.getResultSetInfo();
		
		obj.salaryRevision(300);
		System.out.println("After updation of salary");
		obj.empployeeDetails();
	
		
		
		obj.removeRecord(5);
	System.out.println("After deleting  row from resultset = >");
	obj.empployeeDetails();
	
		obj.insertNewRecord();
		obj.empployeeDetails();
		//obj.getDocDetails(1001);
		//obj.getDepartment(192);
		
	}

}
