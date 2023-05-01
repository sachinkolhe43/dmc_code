import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Day13_9 {

	static Scanner sc = new Scanner(System.in);
	static final String pathname = "Test.dat";

	private static void readRecord() throws FileNotFoundException,IOException
	{
		FileInputStream fis = new FileInputStream(new File(pathname));
		System.out.println(fis.read());
	}

	private static void writeRecord() throws FileNotFoundException,IOException
	{
		int data = 123;
		FileOutputStream fos = new FileOutputStream(new File(pathname));
		fos.write(data);
		System.out.println("Contents are written in the file");
		
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
