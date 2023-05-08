package p1;

//by default if we do not specify the access modifier in front of classname
// it receives the visibility as package level visibility
import java.util.Scanner;

class EmpUtils 
{
	Employee e;
	EmpUtils()
	{
		e= new Employee();
	}
	
	void accept_disp()
	{
		Scanner sc = new Scanner(System.in);
		int id;
		float sal;
		System.out.println("Enter Employee id :");
		id = sc.nextInt();
		System.out.println("Enter Salary ");
		sal = sc.nextFloat();
		e.setEmpid(id);
		e.setSalary(sal);
		
		System.out.println("Empid = "+e.getEmpid());
		System.out.println("Salary = "+e.getSalary());
		
	}
	

}
