package com.phoenix.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnectivity {

	public static void main(String[] args) {
		
		try {
			//for Oracle - oracle.jdbc.Driver
			//for MySQL < 8.x - com.mysql.jdbc.Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//protocol:subprotoco:db-specific information
			//jdbc:mysql://127.0.0.1:3306/test - mysql 
			//jdbc:oracle:thin:@localhost:1521:xe - oracle
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","blackthorne");
			String query="select * from users";
			String insertQuery="insert into users values('a','b')";
			Statement stmt=con.createStatement();  // Container
			int updateRowCount= stmt.executeUpdate(insertQuery);
//			ResultSet rs=stmt.executeQuery(query); // It gives the address of grid 
			/*
			 * ResultSetMetaData rsmd=rs.getMetaData(); rsmd.getColumnName(0)
			 */
			/*
			 * while(rs.next()) { System.out.println(rs.getString(1)); } // to check next row is available or not
			 */

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
