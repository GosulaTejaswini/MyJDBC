package org.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc_Connection {

		
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int  choice;
		try
		{
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first_db","root","Teju@12345");
		System.out.println("Connection Established");
		Statement statement=con.createStatement();
		
		do
		{
			System.out.println("JDBC Menu");
			System.out.println("1.Insert Values");
			System.out.println("2.Delete Values");
			System.out.println("3.Display Values");
			
			System.out.println("Enter Choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: 
				    System.out.println("Insertion Operation");
				    
				    System.out.println("Enter Rollno:");
					int roll=sc.nextInt();
					System.out.println("Enter Name: ");
					String name=sc.next();
					System.out.println("Enter Address");
					String Address=sc.next();
					System.out.println("Enter Phone");
					int phone=sc.nextInt();
					System.out.println("enter Age");
					int age=sc.nextInt();
					
					String query="insert into student values(?,?,?,?,?)";
					
					PreparedStatement ps=con.prepareStatement(query);
					ps.setInt(1,roll);
					ps.setString(2, name);
					ps.setString(3, Address);
					ps.setInt(4, phone);
					ps.setInt(5, age);
					
					int result=ps.executeUpdate();
					
					if(result>0)
					{
						System.out.println("Inserted Successfully");
					    
					}
					else
					{
						System.out.println("Unable to insert data");
					}
					break;
			
			case 2: System.out.println("Delete Operation");
					System.out.println("Enter Roll No: ");
					roll= sc.nextInt();
					
					 query="delete  from student where Roll_No=?";
					 ps=con.prepareStatement(query);
					ps.setInt(1, roll);
					 result=ps.executeUpdate();
					 
					 //statement.executeUpdate(query);
					 
					System.out.println("Deleted Successfully");
					break;
			case 3: System.out.println("Selection Operation");
			         
					ResultSet resultset= statement.executeQuery("select * from student");
					while(resultset.next())
						{
							System.out.println(resultset.getInt(1)+"\t "+resultset.getString(2)+" \t "+resultset.getString(3)+" \t "+resultset.getInt(4)+"\t "+resultset.getInt(5));
						}
					         break;
			
			}
					

		}while(choice!=4);
			
		con.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Occurred");
		}

}
}
