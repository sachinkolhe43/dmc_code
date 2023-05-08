class Person
{
	private String name;
	private int age;
	
	Person()
	{
	}
	
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	void disp()
	{
		System.out.println("Name = "+this.name+" Age = "+this.age);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	void demo() 
	{
		System.out.println("Inside demo method of person class");
	}
	
	
}

class Employee extends Person
{
	private int eid;
	Employee()
	{
		super(); 
	}
	Employee(String name,int age,int eid)
	{
		super(name,age);
		this.eid =eid;
	}
	
	void disp()
	{
		super.disp();
		System.out.println("Eid = "+this.eid);
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + "]"+super.toString() ;
	}
	
	void test()
	{
		System.out.println("Inside employee class test method");
	}
	
}


class Manager extends Employee
{
	private String dept;
	Manager()
	{
		super();
	}
	Manager(String name,int age,int eid,String dept)
	{
		super(name,age,eid);
		this.dept=dept;
	}
	
	void disp()
	{
		super.disp();
		System.out.println("Dept = "+this.dept);
	}
	@Override
	public String toString() {
		return "Manager [dept=" + dept + "]"+ super.toString();
	}
	
	
}


public class Day8_8 {

	public static void main(String[] args) 
	{
		Manager m1= new Manager("Akshita",36,123,"TCT");
		System.out.println(m1);
		m1.disp();
		m1.demo();
		m1.test();

	}

}
