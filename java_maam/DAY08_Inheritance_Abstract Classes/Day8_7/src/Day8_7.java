import java.util.Scanner;


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
	
	void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of the Person :");
		this.name = sc.next();
		System.out.println("Enter Age of the Person : ");
		this.age=sc.nextInt();
	}

	void disp()
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
	
	void accept() // overridden method 
	{
		super.accept(); 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id :");
		this.eid=sc.nextInt();
		System.out.println("Enter Salary : ");
		this.salary=sc.nextInt();
	}
	
	
	void disp()// overridden method 
	{
		super.disp();
		System.out.println("Id = "+this.eid+ " Salary = "+this.salary);
	}
	
	
}



public class Day8_7 
{

	public static void main(String[] args) 
	{
		Employee eobj = new Employee();
		eobj.disp(); //disp() is called upon eobj
		// it will give a call to disp() of Employee class
		// this===> eobj
		eobj.accept();
		
		//this===>eobj 
		eobj.disp();
		
		
		
		
	}

}
