// Employee is-a Person
// we will have paramatrized constructor in both the classes

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
	
	Employee(String name,int age,int eid,int salary)
	{
		//this.name=name;
		//this.age=age;
		super(name,age); //it will give a call to super class
		//paramatrized constructor 
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
	
}



public class Day8_4 
{

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee("Akshita",36,123,70000);
		
		
		
	}

}
