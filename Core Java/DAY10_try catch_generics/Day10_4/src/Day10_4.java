import java.util.InputMismatchException;
import java.util.Scanner;
// in this program Exception is handled by writing  
// multiple catch blocks 
//if we are using multiple catch block
// then super  "Exception" class catch block must be compulsory
// last in sequence 
// otherwise javac error ==> code unreachable

public class Day10_4 
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
			//String str = args[0];
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Second number can not be zero !!");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please supply command line arguments !!");
		}
		catch(Exception e)
		{
			System.out.println("Exception have occured !!");
		}
		
	}

}
