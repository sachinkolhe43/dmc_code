import java.util.Arrays;

//Array of references and Array of Instances 
//Create an array of non primitive type
// create an array of Employee class

class Employee
{
	int empid;
	String name;
	Employee()
	{
		this.empid=1;
		this.name="DEFAULT";
	}
	Employee(int empid,String name)
	{
		this.empid=empid;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
	
	
}

public class Day5_10 {

	public static void main(String[] args) 
	{
		Employee e[] = new Employee[3];
		System.out.println(e[0]);
		System.out.println(e[1]);
		System.out.println(e[2]);
		e[0]=new Employee(123,"p1");
		e[1]=new Employee(456,"p2");
		e[2]=new Employee(789,"p3");
		
		//System.out.println(Arrays.toString(e));
		
		//for(int i=0;i<3;i++)
			//System.out.println(e[i].toString());
		
		for(Employee emp : e)
			System.out.println(emp);
		

	}

}
