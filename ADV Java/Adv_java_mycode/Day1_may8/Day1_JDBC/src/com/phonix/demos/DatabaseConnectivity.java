package com.phonix.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnectivity {

	public static void main(String[] args) {
		
		try {
			try(Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","manager");)
			
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				String query="select * from employee";
				String insertQuery="insert into employee values(101,'Sachin', 20000)";
				
				Statement stmt = con.createStatement();
				int updatRowCount = stmt.executeUpdate(insertQuery);
				System.out.println(updatRowCount);
//				ResultSet rs=stmt.executeQuery(query);
				
//				while(rs.next()){
//					System.out.println(rs.getString(2));
//				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		

	}

}
