import java.util.InputMismatchException;
import java.util.Scanner;

//combine multiple catch blocks

public class Day10_6 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		int res;
		try
		{
			System.out.println("Enter the first number :");
			num1 = sc.nextInt();
			System.out.println("Enter the second number : ");
			num2= sc.nextInt();
		
			res = num1 / num2;
			System.out.println("Result = "+res);
			sc.close();
			
		}
		
		catch(ArithmeticException | InputMismatchException e)
		{
			System.out.println("Exception have occured.");
		}
		
		finally
		{
			System.out.println("Resources are closed!!");
			sc.close();
			
		}
		
	}

}



//try block handler / try with resources 
//try block without catch or without finally ==> YES
// Important note is we must have try block handler 
 
/*
public class Day10_6 
{

	public static void main(String[] args) 
	{
		
		int num1,num2;
		int res;
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter the first number :");
			num1 = sc.nextInt();
			System.out.println("Enter the second number : ");
			num2= sc.nextInt();
		
			res = num1 / num2;
			System.out.println("Result = "+res);
			
			
		}
		
	}
}
*/




/*
//try without catch  ==> YES ==> we must have finally block

public class Day10_6 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		int res;
		try
		{
			System.out.println("Enter the first number :");
			num1 = sc.nextInt();
			System.out.println("Enter the second number : ");
			num2= sc.nextInt();
		
			res = num1 / num2;
			System.out.println("Result = "+res);
			sc.close();
			
		}
		finally
		{
			sc.close();
		}
	}
}

*/



/*

// added a finally block after catch statements 

//try ==> one or more number of catch blocks ==> finally 

public class Day10_6 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		int res;
		try
		{
			System.out.println("Enter the first number :");
			num1 = sc.nextInt();
			System.out.println("Enter the second number : ");
			num2= sc.nextInt();
		
			res = num1 / num2;
			System.out.println("Result = "+res);
			sc.close();
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Please enter correct numbers.");
		}
		catch(Exception e)
		{
			System.out.println("Exception have occured !!");
		}
		finally
		{
			System.out.println("Resources are closed!!");
			sc.close();
			
		}
		
	}

}
*/