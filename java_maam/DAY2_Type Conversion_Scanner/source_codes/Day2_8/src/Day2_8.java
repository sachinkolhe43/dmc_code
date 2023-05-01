// Unboxing and Boxing Examples


public class Day2_8 
{

	public static void main(String[] args) 
	{
		int num = 85; 
		//creating an Integer object
		
		Integer iobj = Integer.valueOf(num); // int to Integer // Boxing
		System.out.println("Obj = "+iobj);


		Integer o1=new Integer(555); // o1 ===> NP 
		int val = o1.intValue(); // NP to P //UNBOXING
		System.out.println("Value = "+val);
		
	}
}






/*
//int intValue()  

public class Day2_8 
{

	public static void main(String[] args) 
	{
		Integer iobj = new Integer(88);
		int num = iobj.intValue();
		System.out.println("Num = "+num);
		
	}
}
*/



/*
//static Integer	valueOf(String s) ===> Integer class 
// String to Integer ==> NP to NP (VALID)

public class Day2_8 
{

	public static void main(String[] args) 
	{
		Integer i = Integer.valueOf("45");
		System.out.println(i);
		
	}
}

*/



/*

//static Integer  valueOf(int i)  ===> Integer class 
// int to Integer ==> P to NP ==> Boxing 
public class Day2_8 
{

	public static void main(String[] args) 
	{
		int num = 55;
		//creating an Integer object
		
		Integer obj=new Integer(num);
		//classname objectname = new classname();
		
		
		obj = Integer.valueOf(num);
		System.out.println("Obj = "+obj);
	}
}
*/




/*
// String to int  ==> NP to P ==> Unboxing 
// String to float ==> NP to P ==> Unboxing 
// String to double ==> NP to P ==> Unboxing 



public class Day2_8 
{

	public static void main(String[] args) 
	{
		int num=Integer.parseInt("25");
		float fval = Float.parseFloat("4.3");
		double d = Double.parseDouble("7.45");
		System.out.println("Num "+num);
		System.out.println("Fval = "+fval);
		System.out.println("D value = "+ d);
		
		

	}

}
*/