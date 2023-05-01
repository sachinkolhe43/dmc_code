import java.util.InputMismatchException;
import java.util.Scanner;
// in this program Exception is handled by writing  a single catch block

public class Day10_5 
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
		
		catch(Exception e)
		{
			System.out.println("Exception have occured !!");
		}
		
	}

}
