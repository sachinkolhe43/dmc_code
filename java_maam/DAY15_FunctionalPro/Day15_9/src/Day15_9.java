import java.util.ArrayList;
import java.util.LinkedList;

// examples of instanceof

public class Day15_9 {

	public static void main(String[] args)
	{
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		ArrayList<String> a1 =new ArrayList<String>();
		if(l1 instanceof LinkedList)
			l1.add(20);
		else
			a1.add("Sunbeam");
		
		System.out.println(l1);
		System.out.println(a1);
		
		 
	}
	
	}


/*
class Employee
 
{
	
}
class Demo
{
	
}
public class Day15_9 {

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		Demo d=new Demo();
		
		boolean status = e1 instanceof Employee;
		System.out.println("Status "+status);
		
		status = d instanceof Demo;
		System.out.println("Status "+status);
		

	}

}
*/