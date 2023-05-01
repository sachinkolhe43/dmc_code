
//third way is to store .class file
class Demo
{
	public void m1()
	{
		System.out.println("Inside Method m1 ");
	}
	
	public void m2()
	{
		System.out.println("Inside Method m2 ");
	}
}

public class Day14_13 {

	public static void main(String[] args) throws ClassNotFoundException 
	{
		
		Class c = Demo.class;
		System.out.println(c);
	}

}






/*
//second way to reflect the class
// use getClass() from Object class

class Demo
{
	public void m1()
	{
		System.out.println("Inside Method m1 ");
	}
	
	public void m2()
	{
		System.out.println("Inside Method m2 ");
	}
}

public class Day14_13 {

	public static void main(String[] args) throws ClassNotFoundException 
	{
		Demo dobj = new Demo();
		Class c = dobj.getClass();
		System.out.println(c);
	}

}

*/
/*
//static Class<?> forName(String className)
//forName() is a method which is used to reflect the class


class Demo
{
	public void m1()
	{
		System.out.println("Inside Method m1 ");
	}
	
	public void m2()
	{
		System.out.println("Inside Method m2 ");
	}
}

public class Day14_13 {

	public static void main(String[] args) throws ClassNotFoundException 
	{
		Class c = Class.forName("Demo");
		System.out.println(c);
	}

}


*/