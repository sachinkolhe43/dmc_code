import java.util.Scanner;

public class Day10_9 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int res;
		System.out.println("Enter First Number ");
		num1 = sc.nextInt();
		System.out.println("Enter Second number ");
		num2 = sc.nextInt();
		try
		{
			if(num2 == 0)
				throw new ArithmeticException("Second number is zero!!");
			//explicit throwing of object 
			else
				{
					res = num1/num2;
					System.out.println("Result = "+res);
				}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	
	
	}

}
