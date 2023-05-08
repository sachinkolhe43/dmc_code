
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//read and write a multiple bytes in the binary file 
// BufferedReader and BufferedWriter
//try block handler / try with resources 


public class Day14_9 {

	static Scanner sc = new Scanner(System.in);
	static final String pathname = "Demo.txt";

	private static void readRecord() throws IOException
	{
		try(BufferedReader bis = new BufferedReader(new FileReader(new File(pathname)));)
		{
			int data;
			while((data = bis.read())!=-1) //-1 indicated end of the file
				System.out.print((char)data+" ");
		}
	
	} 
		
	private static void writeRecord() throws IOException
	{
		
		try(BufferedWriter bos = new BufferedWriter(new FileWriter(new File(pathname)));)
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