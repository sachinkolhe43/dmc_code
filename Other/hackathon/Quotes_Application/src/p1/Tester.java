package p1;

import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
	
	static Scanner read;
	static 
	{
		read= new Scanner(System.in);
	}
	
	static final String path1 = "user.dat";
	static final String path2= "quote.dat";

	
	ArrayList<User> al= new ArrayList<User>();
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		main_menu();

	}

	private static void main_menu() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		int choice;
		do {
			
			System.out.println("!!...........Your Quote Application.......!!");
			System.out.println("***********************************************");
	        System.out.println("\n0. Exit\n1. Sign In. \n2. Sign Up.");
	        System.out.println("=============================================");
	        choice=read.nextInt();
	        switch (choice)
	        {
	        case 1:
	            signin_menu();
	            break;
	        case 2:
	            signup();
	            break;
	        }
	    }while(choice != 0);
		
	}

	private static void signup() throws FileNotFoundException, IOException {
		
		String f_name,l_name;
		String mobile;
		String email;
		String password;
		
		System.out.println("Enter first name: ");
		f_name=read.next();
		
		System.out.println("Enter last name: ");
		l_name=read.next();
		
		System.out.println("Enter mobile no: ");
		mobile=read.next();
		
		System.out.println("Enter email: ");
		email=read.next();
		
		System.out.println("Enter password: ");
		password=read.next();
		
		System.out.println("========================================");
		User u=new User(f_name, l_name, mobile, email, password);
		
		write_record(u);
		
		System.out.println("Signup Successful :) :)");
		
		
		
		
		
	}


	private static void write_record(User u) throws FileNotFoundException, IOException {
		int result = record();
		try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(path1))));)
		{
			User uobj = new User();
			if(result == 0) {
				uobj.setId(1);
			}
			else {
				uobj.setId(result+1);
			}
			
			oos.writeObject(uobj); // Serialization
			
		}
		
	}

	private static void signin_menu() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		int choice;
		String email;
		String password;
		
		System.out.println("Enter Email: ");
		email=read.next();
		
		System.out.println("Enter Password: ");
		password=read.next();
		
		
		
		
		do {
			
			System.out.println("\n0. Sign Out \n"
					+ "1. All Quotes . \n"
					+ "2. My Quotes.\n"
					+ "3. My Fav Quotes.\n"
					+ "4. Like / Unlike Quotes.\n"
					+ "5. New Quote.\n"
					+ "6. Edit Quotes.\n"
					+ "7. Delete Quote.\n"
					+ "8. change password.\n"
					+ "9. Edit Profile.\n");
			System.out.println("==========================================");
			choice=read.nextInt();
			
			switch (choice)
			{
			case 1:
				all_quote();
				break;
			case 2:
				my_quote();
				break;
				
			case 3:
				my_fav_quote();
				break;
			case 4:
				like_quote();
				break;
			case 5:
				new_quote();
				break;
			case 6:
				edit_quote();
				break;
			case 7:
				delete_quote();
				break;
			case 8:
				change_password();
				break;
			case 9:
				edit_profile();
				break;
				
			}
		}while(choice != 0);
		
	}
	
	private static void all_quote() throws ClassNotFoundException, IOException {
		
		read_all_quotes();
	}
	



	private static void read_all_quotes() throws IOException, ClassNotFoundException {

		
			try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(path2))));)
			{
				Quote e = (Quote) ois.readObject(); // Deserialization
				System.out.println("All Quotes = "+e);
				
			}
		
		
	}

	private static void edit_profile() {
		// TODO Auto-generated method stub
		
	}

	private static void change_password() {
		// TODO Auto-generated method stub
		
	}

	private static void delete_quote() {
		// TODO Auto-generated method stub
		
	}

	private static void edit_quote() {
		// TODO Auto-generated method stub
		
	}

	private static void new_quote() throws FileNotFoundException, IOException {

		String quote;
		String author;
		int user_id;
		
		System.out.println("Enter user id: ");
		user_id=read.nextInt();
		
		System.out.println("Enter quote: ");
		quote=read.next();
		
		System.out.println("Enter Author: ");
		author=read.next();
		
		write_record_quote(quote, author);
		
		System.out.println("Thank you....... new quote added (: (:");
	
		
		
		
	}

	private static void write_record_quote(String quote, String author) throws FileNotFoundException, IOException {

		try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(path2))));)
		{
			Quote uobj = new Quote();
			oos.writeObject(uobj); // Serialization
			
		}
	}

	private static void like_quote() {
		// TODO Auto-generated method stub
		
	}

	private static void my_fav_quote() {
		// TODO Auto-generated method stub
		
	}

	private static void my_quote() {
		// TODO Auto-generated method stub
		
	}

	

	
}

