import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
//read and write a multiple bytes in the binary file 
// BufferedOutputStream and BufferedInputStream
//try block handler / try with resources 


public class Day14_4 {

	static Scanner sc = new Scanner(System.in);
	static final String pathname = "Test.dat";

	private static void readRecord() throws IOException
	{
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(pathname)));)
		{
		null	int data;
			while((data = bis.read())!=-1) //-1 indicated end of the file
				System.out.print((char)data+" ");
		}
	
	} 
		
	private static void writeRecord() throws IOException
	{
		
		try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(pathname)));)
		{
			for(char ch='A';ch<='Z';ch++)
				bos.write(ch);
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
