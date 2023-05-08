import java.util.Scanner;
// in this program handle the exception 

public class Day10_2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		int res;
		System.out.println("Enter the first number :");
		num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		num2= sc.nextInt();
		try
		{
			res = num1 / num2;
			System.out.println("Result = "+res);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Second number can not be zero");
		}
		
	}

}
