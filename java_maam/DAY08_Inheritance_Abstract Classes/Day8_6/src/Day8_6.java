import java.util.Scanner;

// Employee is-a Person
// method calling of super class from sub class 




class Person
{
	private String name;
	private int age;
	
	public Person() 
	{
		super();
		this.name="DEFAULT";
		this.age=18;
	}
	
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	void accept_person_details()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of the Person :");
		this.name = sc.next();
		System.out.println("Enter Age of the Person : ");
		this.age=sc.nextInt();
	}

	void disp_person_details()
	{
		System.out.println("Name = "+this.name+" Age ="+this.age);
	}
	
}


class Employee extends Person
{
	private int eid;
	private int salary;

	
	public Employee() 
	{
		
		super(); 
		this.eid=1;
		this.salary=50000;
	}
	
	Employee(String name,int age,int eid,int salary)
	{
		super(name,age); //it will give a call to super class paramatrized constructor
		this.eid=eid;
		this.salary=salary;
	}
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	void accept_emp_details()
	{
		
		this.accept_person_details();  // VALID // Recommended 
		// accept_person_details(); //VALID 
		//super.accept_person_details();// VALID 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id :");
		this.eid=sc.nextInt();
		System.out.println("Enter Salary : ");
		this.salary=sc.nextInt();
	}
	
	
	void disp_emp_details()
	{
		
		this.disp_person_details(); // VALID // Recommended 
		// disp_person_details(); //VALID 
		// super.disp_person_details(); //VALID 
		
		System.out.println("Id = "+this.eid+ " Salary = "+this.salary);
	}
	
	
}



public class Day8_6 
{

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.accept_emp_details();
		e1.disp_emp_details();
		
		
		
	}

}
