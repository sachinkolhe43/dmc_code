// toString() is not present in Employee class
// so if we print the object then toString() will be called from Object class
// Objecct class toString() display consise information about object
// classname@hashcode

class Employee
{
	private int empid;
	private String name;
	private int salary;
	
	public Employee() 
	{
		
	}
	public Employee(int empid, String name, int salary) 
	{
		
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	void disp()
	{
		System.out.println("Name = "+this.name+" EMPID ="+this.empid+" Salary = "+this.salary);
	}
	
	
	
}

public class Day4_1 {

	public static void main(String[] args) 
	{
		
		Employee eobj=new Employee();
		System.out.println(eobj); //eobj.toString() ==> from Object class
		eobj.disp(); // this===> eobj
	}

}
