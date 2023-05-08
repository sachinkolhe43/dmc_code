import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//read and write a single byte in the text file 
//FileReader and FileWriter



public class Day14_8 {

	static Scanner sc = new Scanner(System.in);
	static final String pathname = "Demo.txt";

	private static void readRecord() throws IOException
	{
		try(FileReader fis = new FileReader(new File(pathname));)
		{
			System.out.println(fis.read());
		}
	
	} 
		
	private static void writeRecord() throws IOException
	{
		int data = 123;
		try(FileWriter fos = new FileWriter(new File(pathname));)
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