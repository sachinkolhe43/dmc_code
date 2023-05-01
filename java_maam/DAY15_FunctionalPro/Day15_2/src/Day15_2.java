import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// requirement
// create one user defined class
// fields, methods and constructor
// fetch meta data of these declaration
// observe behavior of method execution

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


public class Day15_2 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, InvocationTargetException 
	{	
		ReflectionDemo robj = new ReflectionDemo();
		// reflect the class
		Class cls = robj.getClass();
		System.out.println("Cls = "+cls);
		
		//Method marr[] = cls.getMethods();
		//for(Method m : marr)
			//System.out.println(m);
		
		Method m = cls.getDeclaredMethod("m1");
		System.out.println(m);
		m.invoke(robj);
		
		m =cls.getDeclaredMethod("m2", int.class);
		m.invoke(robj,55);
		
		
		m =cls.getDeclaredMethod("m2", int.class);
		m.invoke(robj,222);
		
		m = cls.getDeclaredMethod("m3"); 
		// because m3 is private method
		// Exception //java.lang.IllegalAccessException
		//to avoid exception
		m.setAccessible(true);
		m.invoke(robj);
		
		
		
		
	}

}
