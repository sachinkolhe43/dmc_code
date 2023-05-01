import java.lang.reflect.Method;

// if we wish to fetch methods inside Object class

public class Day14_15 {

	public static void main(String[] args) 
	{
		//reflect the class
		Class c = Object.class;
		
		// fetch metadata of methods
		Method marr[] = c.getDeclaredMethods();
		for(Method m : marr)
			System.out.println(m);
	
	}

}
