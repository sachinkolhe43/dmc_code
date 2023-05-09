package com.db.quote;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Tester {
	
	static Scanner read;
	static {
		read=new Scanner(System.in);
	}
	public static void main(String[] args) {
		int choice;
		do 
		{	
			System.out.println("Enter your Choice:");
			System.out.println("/n0. Exit /n1. Signup /n2. Signin");
			choice=read.nextInt();
			switch(choice)
			{
			
			case 1:
				signUp();
				break;
			case 2:
				signIn();
				break;
				
			}
			
		}while(choice!=0);
	}
	private static void signIn() {
		
		String uname,pass;
		
		System.out.println("Enter User name");
		uname=read.next();
		
		System.out.println("Enter Password");
		pass=read.next();
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/quote","root","manager");
			String SelectQuery="select * from users where first_name='Nilesh'";
			Statement stm=con.createStatement();
			ResultSet rslt = stm.executeQuery(SelectQuery);
			while(rslt.next()) {
			String str1=rslt.getString(4);
			String str2=rslt.getString(5);
			if(str1.equals(uname)) {
				if(str2.equals(pass)) {
					System.out.println("Login Successfully...");
				}
			}
			else {
				System.out.println("Username or Password is wrong!!!");
			}
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	private static void signUp() {

		String fname, lname, email, pass;
		int mobile;
		
		System.out.println("Enter First name");
		fname=read.next();
		
		System.out.println("Enter Last name");
		lname=read.next();
		
		System.out.println("Enter Email");
		email=read.next();
		
		System.out.println("Enter Password");
		pass=read.next();
		
		System.out.println("Enter Mobile No");
		mobile=read.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/quote","root","manager");
			Statement stmt=conn.createStatement();
			String InsertQuery = "insert into users (first_name,last_name,email,passwd,mobile) values ('"+fname+"','"+lname+"','"+email+"','"+pass+"','"+mobile+"')";
			int updateData=stmt.executeUpdate(InsertQuery);
			System.out.println("Logilnamen Succeessful...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
