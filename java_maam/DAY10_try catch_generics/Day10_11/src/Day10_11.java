import java.util.Scanner;

// Age from the user
// age > 0 and age < 80 ==> VALID
// else throw the Exception AgeException()


class AgeException extends Exception
{
	AgeException()
	{
		
	}
	AgeException(String s)
	{
		super(s);
		// this will call paramatrized constructor from Exception class
		//Exception(String message)
	}
}


public class Day10_11 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter Age ");
		age = sc.nextInt();
		
		try
		{
			if(age > 0 && age<80)
				System.out.println("VALID AGE !!");
			else
				throw new AgeException("INVALID AGE!!");
			}
		catch(AgeException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}
