
interface TestInterface1
{
	default void disp()
	{
		System.out.println("Display function of interface1");
	}
}


interface TestInterface2
{
	default void disp()
	{
		System.out.println("Display function of interface2");
	}
}

public class Day17_8 implements TestInterface1,TestInterface2
{
	@Override
	public void disp()
	{
		System.out.println("Inside display function of class");
		TestInterface1.super.disp();
		TestInterface2.super.disp();
		
		
	}

	public static void main(String[] args) 
	{
		Day17_8 dobj = new Day17_8();
		dobj.disp();

	}

}
