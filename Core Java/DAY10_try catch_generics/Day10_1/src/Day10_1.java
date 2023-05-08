import java.util.Scanner;
// in this program exception is not handled 

public class Day10_1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		int res;
		System.out.println("Enter the first number :");
		num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		num2= sc.nextInt();
		res = num1 / num2;
		System.out.println("Result = "+res);
		
	}

}
