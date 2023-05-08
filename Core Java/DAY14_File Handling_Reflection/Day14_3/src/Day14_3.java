import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
//read and write a single byte in the binary file 
//FileOutputStream and FileInputStream
// resources must be relealesed immediately once the object job is over
//try block handler / try with resources 


public class Day14_3 {

	static Scanner sc = new Scanner(System.in);
	static final String pathname = "Test.dat";

	private static void readRecord() throws IOException
	{
		try(FileInputStream fis = new FileInputStream(new File(pathname));)
		{
			System.out.println(fis.read());
		}
	
	} 
		
	private static void writeRecord() throws IOException
	{
		int data = 123;
		try(FileOutputStream fos = new FileOutputStream(new File(pathname));)
		{
			fos.write(data);
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