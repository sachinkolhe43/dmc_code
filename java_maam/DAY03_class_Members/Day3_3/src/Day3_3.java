import java.util.Scanner;

//declaring fields of the class as private 
// fields can be modified by only methods of the class
//getter (Inspectors)
// setter (Mutators)
// getter and setters are used to fetch the private fields and set the private fields 


class Employee
{
	// Data hiding 
	private int empid;
	private String name;
	private float salary;
	
	void accept()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		empid = sc.nextInt();
		System.out.println("Enter Name : ");
		name = sc.next();
		System.out.println("Enter Salary : ");
		salary = sc.nextFloat();
	}
	
	void setSalary(float s)
	{
		salary = s;
	}
	
	String getName()
	{
		return name;
		
	}
	
	
	void disp()
	{
		System.out.println("Empid = "+empid+ " Name = "+name+" Salary "+salary);
	}
	
}




public class Day3_3 
{

	public static void main(String[] args)
	{
		float new_salary;
		Scanner sc = new Scanner(System.in);
		Employee e1=new Employee();
		e1.accept(); //accept() is called upon e1
		e1.disp(); //disp() is called upon e1
		System.out.println("Enter the new salary amount");
		new_salary = sc.nextFloat(); 
		e1.setSalary(new_salary); //set_salary() is called upon e1
		//fetch/get name from e1 object
		e1.disp();
		System.out.println("Name = "+e1.getName());
		
		
	}
}





