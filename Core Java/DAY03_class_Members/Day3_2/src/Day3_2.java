import java.util.Scanner;

//the fields of the class receives by default package level visibility 

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




public class Day3_2 
{

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.empid=123;
		e1.name="emp1";
		e1.salary=20000;
		e1.disp();
		e2.empid=456;
		e2.name="emp2";
		e2.salary=70000;
		e2.disp();
		e2.salary=e1.salary; // not recommended 
		e2.disp();
		
	}
}





