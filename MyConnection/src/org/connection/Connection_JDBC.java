package org.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Connection_JDBC {

	public void DoConnection()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Driver mydriver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(mydriver);
			String url="jdbc:mysql://localhost:3306/first_db";
			String UserName="root";
			String Password="Teju@12345";
			
			Connection con=DriverManager.getConnection(url,UserName,Password);
			
			Statement stmt=con.createStatement();
			
			String query="insert into student values(1,'Ram','Hyderabad',93506,26)";
			stmt.executeUpdate(query);
			
			System.out.println("Query Executed--"+query);
			con.close();
		} 
		
		catch (Exception e) {
			System.out.println("Exception >>>>>"+e);
		}
		
	}
	public static void main(String[] args) {
		Connection_JDBC jdbc=new Connection_JDBC();
		jdbc.DoConnection();
		
	}

}
