package com.db.quote;

import java.util.Scanner;

public class Tester {
	
	static Scanner read;
	static {
		read=new Scanner(System.in);
	}

	private static void signIn() {
		
		
	}
	
	private static void signUp() {
//		first_name, last_name, email, passwd, mobile
		String fname,lname,email,pass;
		int mobile;
		
		System.out.println("Enter First Name: ");
		fname=read.next();
		
		
	}
	
	private static void deleteQuoteById() {
		
		
	}
	
	private static void editQuote() {
		
		
	}
	
	private static void displayQuotesOfUser() {
		
		
	}
	
	private static void addQuote() {
		
		
	}
	
	private static void displayAllQuotes() {
		
		
	}
	
	private static void changePassword() {
		
		
	}
	
	private static void changeProfile() {
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner read=new Scanner(System.in);
		
		int choice;
		
		
		do {
			System.out.println("Enter your choice: ");
			System.out.println("\n0. Exit+"
					+ "\n1. SignIn()"
					+ "\n2. SignUp()"
					+ "\n3. ChangeProfile()"
					+ "\n4. ChangePassword()"
					+ "\n5. displayAllQuotes()"
					+ "\n6. displyQuotesOfUser()"
					+ "\n7. addQuote()"
					+ "\n8. editQuote()"
					+ "\n9. deleteQuoteById()");
			
			;
			switch(choice=read.nextInt())
			{
				case 1:
					signIn();
					break;
					
				case 2:
					signUp();
					break;
					
				case 3:
					changeProfile();
					break;
					
				case 4:
					changePassword();
					break;
				
				case 5:
					displayAllQuotes();
					break;
				
				case 6:
					displayQuotesOfUser();
					break;
					
				case 7:
					addQuote();
					break;
					
				case 8:
					editQuote();
					break;
					
				case 9:
					deleteQuoteById();
					break;
					
					
					
			}
			System.out.println("");
		}while(choice==0);
		
	}


}
