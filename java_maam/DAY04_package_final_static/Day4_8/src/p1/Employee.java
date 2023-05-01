package p1;

class Employee 
{
	int empid;
	float salary;
	Employee()
	{
		this.empid=1;
		this.salary=50000;
	}
	Employee(int empid,int salary)
	{
		this.empid=empid;
		this.salary=salary;
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
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + "]";
	}

	
	
	
}
