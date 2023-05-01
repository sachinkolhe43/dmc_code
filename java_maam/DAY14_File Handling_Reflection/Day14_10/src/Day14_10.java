//example of @Override
class Person
{
	void printData()
	{
		System.out.println("Inside person class print method");
	}
	void m1()
	{
		System.out.println("Inside person class m1 method");
	}
}

class Employee extends Person
{
	@Override
	void printData()
	{
		System.out.println("Inside employee class print method");
	}
	
	
	void m2()
	{
		System.out.println("Inside employee class m2 method");
	}
	
	
}


public class Day14_10 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
