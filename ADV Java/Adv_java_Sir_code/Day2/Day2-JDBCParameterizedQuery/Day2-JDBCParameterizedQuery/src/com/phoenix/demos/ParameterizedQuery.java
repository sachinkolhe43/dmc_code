package com.phoenix.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ParameterizedQuery {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","blackthorne");
			String insertQuery="insert into users values(?,?)";
			PreparedStatement pstmt=con.prepareStatement(insertQuery);
			
			pstmt.setString(1, "username");
			pstmt.setString(2, "password");
			int updateRowCount=pstmt.executeUpdate();
			System.out.println("Total number of rows affected are: "+updateRowCount);
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
