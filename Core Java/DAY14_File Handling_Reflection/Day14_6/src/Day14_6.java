import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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
import java.util.Scanner;
//read and write object(user defined class) in the binary file 
// ObjectOutputStream and ObjectInputStream
//try block handler / try with resources 


class Employee implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	int empid;
	float salary;
	
	Employee(String name, int empid,float salary)
	{
		this.name=name;
		this.empid=empid;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
	}
	
	
}


public class Day14_6 {

	static Scanner sc = new Scanner(System.in);
	static final String pathname = "Test.dat";

	private static void readRecord() throws IOException, ClassNotFoundException
	{
		try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(pathname))));)
		{
			Employee e = (Employee) ois.readObject(); // Deserialization
			System.out.println("Employee Record = "+e);
			
		}
	
	} 
		
	private static void writeRecord() throws IOException
	{
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(pathname))));)
		{
			Employee eobj = new Employee("Akshita",123,60000.5f);
			oos.writeObject(eobj); // Serialization
			
		}
	}
	
	
	static int menuList()
	{
		
		System.out.println("Enter option 0.Exit 1.Write 2. Read");
		return sc.nextInt();
	}
	
	public static void main(String[] args)  throws IOException, ClassNotFoundException
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