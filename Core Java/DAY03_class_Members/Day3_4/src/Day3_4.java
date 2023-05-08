import java.util.Scanner;





// NPE ( Null Pointer Exception)
//Calling the instance method of a null object.
//Accessing or modifying the field of a null object.



//Solution to NPE is to allocate memory for the reference 

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
	
	
	
	void disp()
	{
		System.out.println("Empid = "+empid+ " Name = "+name+" Salary "+salary);
	}
	
}


public class Day3_4 {

	public static void main(String[] args) 
	{
		Employee e1 = null; // allowed // null reference //null object 
		e1=new Employee(); // allocating a memory to object 
		e1.accept(); 
		e1.disp(); 
		

	}

}




/*
public class Day3_4 {

	public static void main(String[] args) 
	{
		Employee e1 = null; // allowed // null reference //null object 
		e1.accept(); //accept() is called upon e1 object // instance method  // NPE 
		e1.disp(); // disp() is called upon e1 object // instance method  // NPE
		

	}

}
*/

/*
public class Day3_4 {

	public static void main(String[] args) 
	{
		Employee e1; // uninitialized reference // javac error 
		e1.accept(); //javac error
		e1.disp(); // javac error
		

	}

}

*/
