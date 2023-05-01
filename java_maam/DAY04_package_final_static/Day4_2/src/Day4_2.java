//In this example we have overridden toString() method in Employee class
// toString() is generally overridden to dislplay consise information
//from object

class Employee
{
	private int empid;
	private String name;
	private int salary;
	
	public Employee() 
	{
		this.name="DEFAULT";
		this.empid=1;
		this.salary=50000;
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
	
	public String toString() 
	{
		return "Employee [empid=" + this.empid + ", name=" + this.name + "]";
	}
	
	//public String toString()
	//{
		//return this.name +"\t"+this.empid;
	//}
	
	
	
	
	
}

public class Day4_2 {

	public static void main(String[] args) 
	{
		
		Employee eobj=new Employee();
		System.out.println(eobj); 
		//eobj.toString() ==> from Employee class (IMPLICIT CALL)
		System.out.println(eobj.toString()); //EXPLICIT CALL 
	}

}
