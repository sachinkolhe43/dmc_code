// Employee is-a Person
// we will have parameterless(User defined default Constructor)
//parameterless constructors in both classes
// writing of super() is optional


class Person
{
	private String name;
	private int age;
	
	
	
	public Person() 
	{
		super(); // it will give a call to super class (Object) default constructor 
		System.out.println("Inside Person class Parameterless cnstr");
		this.name="DEFAULT";
		this.age=18;
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
	
	
}


class Employee extends Person
{
	private int eid;
	private int salary;

	
	public Employee() 
	{
		
		super(); // to call super class (Person) parameterlss constrcutor
		System.out.println("Inside Employee class Parameterless constructor");
		this.eid=1;
		this.salary=50000;
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
	
}



public class Day8_3 
{

	public static void main(String[] args) 
	{
		Employee eobj = new Employee();
		System.out.println(eobj.getName());
		System.out.println(eobj.getAge());
		System.out.println(eobj.getEid());
		System.out.println(eobj.getSalary());
		
		
	}

}
