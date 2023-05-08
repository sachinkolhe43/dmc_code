import java.util.Scanner;

//this keyword 
//this holds the current object 


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

	void setAge(int age)
	{
		this.age = age;
	}
	
	
	void disp()
	{
		System.out.println("Empid = "+this.empid+ " Name = "+this.name+" Age "+this.age);
	}
}


public class Day3_5 {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.accept(); //accept() is called upon e1 object
		// e1 ==> current object ==> "this" will hold e1 
		e1.disp(); // disp() is called upon e1 object
		// "this" will hold current object e1 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new age");
		int new_age = sc.nextInt();
		e1.setAge(new_age);
		e1.disp();
		
	}

}
