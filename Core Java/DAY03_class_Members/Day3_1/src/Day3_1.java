import java.util.Scanner;

class Employee
{
	int empid;
	String name;
	float salary;
	
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




public class Day3_1 
{

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=e1;
		e1.accept(); //accept() is called upon e1
		e2.accept(); //accept() is called upon e2
		e1.disp(); //disp() is called upon e1
		e2.disp(); //disp() is called upon e2
		e3.disp();
		
		
		
	}
}





/*

public class Day3_1 {

	public static void main(String[] args)
	{
		Employee eobj = new Employee(); //eobj is object of Employee class
		eobj.accept();  // accept() is called upon eobj object 
		eobj.disp(); //disp() is called upon eobj object 
		

	}

}
*/


