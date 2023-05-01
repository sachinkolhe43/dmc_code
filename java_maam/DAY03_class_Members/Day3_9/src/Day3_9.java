import java.util.Scanner;

//Constructor Chaining




class Employee
{
	private int empid; 
	private String name;
	private int age;
	
	Employee() // parameterless constructor 
	{
		this.empid=1;
		this.name="DEFAULT";
		this.age=18;
	}
	
	Employee(int empid,String name,int age) //parametrized constructor 
	{
		this.empid=empid;
		this.name=name;
		this.age=age;
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


public class Day3_9 {

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.disp(); // 1 DEFAULT 18
		
		Employee e2= new Employee(123,"Akshita",36);
		e2.disp(); // 123  Akshita 36
		
			
		

	}

}
