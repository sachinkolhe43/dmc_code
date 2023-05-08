


//Variable Argument / Arity Method


public class Day6_5
{
	public static void main(String... args) //VALID // Variable number of arguments
	{
		String str = args[0];
		String name=args[1];
		
		System.out.println("Concept : Variable Arguments "+str+"\t"+name);
		
	}
	
}


/*
public class Day6_5 {
	
	static int sum(int... arguments) // it maintains 1D array 
	{
		int res=0;
			
		for(int element : arguments)
			res = res + element;
		return res;
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println(sum());
		System.out.println(sum(10,15));
		System.out.println(sum(5,4,3));
		System.out.println(sum(20,40,60,80));

	}

}
*/