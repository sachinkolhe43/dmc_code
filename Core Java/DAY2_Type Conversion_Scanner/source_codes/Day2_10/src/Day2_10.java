import java.util.Scanner;

// Requirement
// Take name from the user (String)
// Take empid from the user (int)
// take salary in float format
//  use Scanner class


public class Day2_10 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int empid;
		float salary;
		System.out.println("Enter Your name : ");
		name= sc.nextLine();
		
		System.out.println("Enter Employee id = ");
		empid = sc.nextInt();
		
		System.out.println("Enter Salary = ");
		salary = sc.nextFloat();
		//System.out.println(name+empid+salary);
		System.out.printf("%s %d %f", name,empid,salary);
		System.out.printf("\n%10s %10d %10.2f", name,empid,salary);
		System.out.printf("\n%-10s %-10d %-10.2f", name,empid,salary);
		
	}

}
