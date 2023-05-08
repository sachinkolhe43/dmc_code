import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// create a reflection of class Demo
// fetch the methods metadata inside the class Demo

class Demo
{
	int num1;
	int num2;
	Demo()
	{
		
	}
	Demo(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public void m1()
	{
		System.out.println("Inside Method m1 ");
	}
	
	public void m2()
	{
		System.out.println("Inside Method m2 ");
	}
}

public class Day14_14 {

	public static void main(String[] args) throws ClassNotFoundException 
	{
		
		Class c = Class.forName("Demo"); //reflect the class
		System.out.println(c);
		System.out.println("Fetching Metadata for Method");
		Method marr[] = c.getDeclaredMethods(); //fetch the method information
		for(Method m : marr)
			System.out.println(m);
		
		System.out.println("\n Fetching Metadata for fields");
		Field farr[] = c.getDeclaredFields();
		for(Field f : farr)
			System.out.println(f+"\t");
		
		
		System.out.println("\n Fetching Metadata for constructor");
		Constructor<Demo> carr[] = c.getDeclaredConstructors();
		for(Constructor ctr : carr)
			System.out.println(ctr+"\t");
		
		
		
	}

}
