//default methods 
interface TestInterface
{
	public void square(int a);
	
	static void m1()
	{
		System.out.println("Inside M1 method");
	}
	
}


public class Day17_7 implements TestInterface
{
	@Override
	public void square(int a) 
	{
		System.out.println("Area = "+(a*a));
		
	}
	public static void main(String[] args) 
	{
		Day17_7 dobj = new Day17_7();
		dobj.square(5);
		
		TestInterface.m1();
	}

	

}
