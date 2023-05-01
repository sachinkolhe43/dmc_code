import java.util.Scanner;

// User defined Exception Class
// Custom Exception class
// Requirement
// accept a number from user
// number > 100  then it must throw one exception 

// NumberIsInvalidException


class NumberIsInvalidException extends Exception
{
	NumberIsInvalidException()
	{
		System.out.println("User Level Exception");
	}
}

public class Day10_10 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter Number ");
		num = sc.nextInt();
		try
		{
			if(num > 100)
				throw new NumberIsInvalidException();
			else
				System.out.println("Number  = "+num);
		}
		catch(NumberIsInvalidException e)
		{
			System.out.println(e);
		}
	
	}

}
