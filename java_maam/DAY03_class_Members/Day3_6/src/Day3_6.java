import java.util.Scanner;
// Constructor
// is used to initialize the fields of the class
// if we do not specify the constructor in the class, it gives a call to DEFAULT CONSTRUCTOR

class Employee
{
	private int empid; 
	private String name;
	private int age;
	
	void accept()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		this.empid = sc.nextInt();
		System.out.println("Enter Name : ");
		this.name = sc.next();
		System.out.println("Enter Age : ");
		this.age = sc.nextInt();
	}

	
	void disp()
	{
		System.out.println("Empid = "+this.empid+ " Name = "+this.name+" Age "+this.age);
	}
}


public class Day3_6 {

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.disp();

	}

}
