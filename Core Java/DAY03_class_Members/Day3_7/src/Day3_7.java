import java.util.Scanner;
//Requirement
// as soon as we create the object it should get initialized with default values
// eg. empid = 1 name = "DEFAULT"  age = 18 

// User Defined Default Constructor / Parameterless Constructor 
// is used to initialize the fields of the class
// It is a special member function defined inside the class
// It is having same name as the class name
// it does not have any return type
// constructor call is implicit call
// per object constructor is called only once  


class Employee
{
	private int empid; 
	private String name;
	private int age;
	
	Employee()
	{
		this.empid=1;
		this.name="DEFAULT";
		this.age=18;
	}
	
	
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


public class Day3_7 {

	public static void main(String[] args)
	{
		Employee e1=new Employee(); 
		// here user defined default constructor will be called automatically
		// IMPLICIT CALLING OF THE FUNCTION
		
		e1.disp(); //disp() is called upon e1 object 
		// EXPLICIT CALLING OF THE FUNCTION
		
		e1.accept();
		e1.disp();
		

	}

}
