// Nested Class

class Outer // Outer.class
{
	Outer()
	{
		System.out.println("Inside Outer class constructor");
	}
	
	class Inner  // non static nested class // Outer$Inner.class
	{
		Inner()
		{
			System.out.println("Inside Inner class constructor");
		}
	}
	
}
public class Day9_3  // Day9_3.class
{

	public static void main(String[] args) 
	{
		Outer o1= new Outer();
		Outer.Inner i1 = o1.new Inner();
		
		//OR 
		
		Outer.Inner i = new Outer().new Inner();
		
	}

}
