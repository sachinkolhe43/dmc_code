import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// requirement
// create one user defined class
// fields, methods and constructor
// fetch meta data of these declaration
// observe behavior of fields and constructors

class ReflectionDemo
{
	private String str;
	public int data;
	 
	public ReflectionDemo()
	{
		str="Sunbeam";
	}
	
	public ReflectionDemo(String str)
	{
		this.str=str;
	}
	
	public void m1()
	{
		System.out.println("Inside Method 1 str = "+this.str);
	}
	
	public void m2(int num)
	{
		System.out.println("Inside method 2 Num = "+num);
	}
	
	private void m3()
	{
		System.out.println("Inside Method m3");
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	
	
}


public class Day15_1 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException 
	{	
		ReflectionDemo robj = new ReflectionDemo();
		// reflect the class
		Class cls = robj.getClass();
		System.out.println("Cls = "+cls);
		Constructor c = cls.getConstructor();
		System.out.println("Name of constructor = "+c);
		System.out.println("Name of constructor = "+c.getName());
		
		System.out.println("------Fetching metadata of all methods-----");
		// reflecting all the declared methods of the class
		//including public, protected, default (package) access, 
		// and private methods, but excluding inherited methods.
		Method m[] = cls.getDeclaredMethods();
		for(Method mtd : m)
			System.out.println(mtd);
		
		System.out.println("----Fetching metadata of all public methods-----");
		
		m = cls.getMethods();
		for(Method mtd : m)
			System.out.println(mtd);
		
		System.out.println("-----get Fields method-----");
		Field farr[] = cls.getFields(); //return only public fields 
		for(Field f : farr)
			System.out.println(f);
		System.out.println("-----fetching all the fields---");
		farr = cls.getDeclaredFields(); //all fields 
		for(Field f : farr)
			System.out.println(f);
		
		
		Field f = cls.getDeclaredField("str"); //fetching specific field
		System.out.println("Field = "+f);
		f.setAccessible(true);
		f.set(robj, "core java ");
		System.out.println("str = "+robj.getStr());
		
		
		
		
	}

}
