import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
//read and write a single byte in the binary file 
//FileOutputStream and FileInputStream
//try , catch and finally blocks 

public class Day14_2 {

	static Scanner sc = new Scanner(System.in);
	static final String pathname = "Test.dat";

	private static void readRecord() 
	{
		FileInputStream fis=null;
		try 
		{
			fis = new FileInputStream(new File(pathname));
			System.out.println(fis.read());
			
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fis.close();
			} 
			catch (IOException e) 
			{
				
				e.printStackTrace();
			}
		}
	}

	private static void writeRecord() 
	{
		int data = 123;
		FileOutputStream fos=null;
		
		try 
		{
			 fos = new FileOutputStream(new File(pathname));
			fos.write(data);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fos.close();
			} 
			catch (IOException e) 
			{
				
				e.printStackTrace();
			}
		}
		System.out.println("Contents are written in the file");
		
	}
	
	
	static int menuList()
	{
		
		System.out.println("Enter option 0.Exit 1.Write 2. Read");
		return sc.nextInt();
	}
	
	public static void main(String[] args)  
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