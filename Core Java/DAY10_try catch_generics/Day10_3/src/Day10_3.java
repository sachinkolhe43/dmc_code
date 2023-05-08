import java.util.InputMismatchException;
import java.util.Scanner;
// in this program Exception is handled by writing  
// multiple catch blocks 

public class Day10_3 
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
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Second number can not be zero !!");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter valid number!!");
		}
		
	}

}
