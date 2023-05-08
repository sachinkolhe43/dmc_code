
//Method reference to the instance of object

@FunctionalInterface
interface MyInterface
{
	void display();
}


public class Day15_10 
{
	
	public void myMethod()
	{
		System.out.println("Inside My Method function");
	}
	
	public void demo()
	{
		System.out.println("Inside demo method");
	}
	
	public void test()
	{
		System.out.println("Inside test function");
	}
	
	public static void main(String[] args) 
	{
		Day15_10 dobj = new Day15_10();
		MyInterface ref = dobj::myMethod;
		ref.display();
		ref = dobj::demo;
		ref.display();
		ref = dobj::test;
		ref.display();

	}

}
