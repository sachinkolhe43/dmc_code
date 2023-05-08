


public class Day10_8 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("First Statement");
		Thread.sleep(3000);
		System.out.println("Second Statement");
			
	}
}


/*
public class Day10_8 {

	public static void main(String[] args) 
	{
		System.out.println("First Statement");
		try
		{
			Thread.sleep(3000);
		
			System.out.println("Second Statement");
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception handled!!");
		}
	}
}

*/



/*
public class Day10_8 {

	public static void main(String[] args) 
	{
		try
		{

			int num = Integer.parseInt("123abcd");
			System.out.println(num);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
*/


/*
public class Day10_8 {

	public static void main(String[] args) 
	{
		int num = Integer.parseInt("123abcd");
		System.out.println(num);

	}

}
*/