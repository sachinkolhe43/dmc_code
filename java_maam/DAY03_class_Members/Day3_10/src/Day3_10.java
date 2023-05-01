import java.util.Scanner;

//Member Functions of the class: constructor , getter , setters , facilitators 

class Employee
{
	String name;
	int empid;
	float salary;
	
	
	public Employee() 
	{
		
	}
	
	
	

	public Employee(String name, int empid, float salary) 
	{
		
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}

	


	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getEmpid() {
		return empid;
	}




	public void setEmpid(int empid) {
		this.empid = empid;
	}




	public float getSalary() {
		return salary;
	}




	public void setSalary(float salary) {
		this.salary = salary;
	}




	// facilitators 
	void accept()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name ");
		this.name = sc.next();
		System.out.println("Enter Empid : ");
		this.empid= sc.nextInt();
		System.out.println("Enter Salary :");
		this.salary = sc.nextFloat();
	}
	
	void disp()
	{
		System.out.println("Name = "+this.name + " EMPID = "+this.empid + " Salary = "+this.salary);
	}
	
	
}
public class Day3_10 {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		System.out.println(e1);
		// whenever we print object it gives a call to the method toString()
		// since Employee class is not having toString() definition
		// so it will call toString() from Object class  
		
		//public String toString()
		//getClass().getName() + '@' + Integer.toHexString(hashCode())
		Employee e2=new Employee();
		System.out.println(e2);
		Employee e3=e1;
		System.out.println(e3);
		
		

	}

}
