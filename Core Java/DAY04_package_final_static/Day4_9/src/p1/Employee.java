package p1;

public class Employee 
{
	int empid;
	float salary;
	
	public Employee()
	{
		this.empid=1;
		this.salary=50000;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + "]";
	}
	
	
	
}

