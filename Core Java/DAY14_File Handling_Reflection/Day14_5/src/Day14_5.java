import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
//read and write primitive in the binary file 
// DataOutputStream and DataInputStream
//try block handler / try with resources 


public class Day14_5 {

	static Scanner sc = new Scanner(System.in);
	static final String pathname = "Test.dat";

	private static void readRecord() throws IOException
	{
		try(DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(pathname))));)
		{
			String name = dis.readUTF();
			float salary = dis.readFloat();
			int age = dis.readInt();
			System.out.println("Name = "+name+" Salary = "+salary+" Age = "+age);
		}
	
	} 
		
	private static void writeRecord() throws IOException
	{
		
		try(DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(pathname))));)
		{
			dos.writeUTF("Akshita");
			dos.writeFloat(60000.50f);
			dos.writeInt(36);
		}
	}
	
	
	static int menuList()
	{
		
		System.out.println("Enter option 0.Exit 1.Write 2. Read");
		return sc.nextInt();
	}
	
	public static void main(String[] args)  throws IOException
	{
		int choice;
		while((choice = menuList())!=0)
		{
			switch(choice)
			{
				case 1:
					writeRecord();
				break;
				case 2:
					readRecord();
				break;
			}
		}
		
	}


}