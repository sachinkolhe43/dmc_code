import java.util.Scanner;

public class Day5_1 
{
	
	static int num1; // static field 
	static int num2; // static field
	static Scanner sc;// static reference (field) 
	
	static 
	{
		
		sc=new Scanner(System.in); // static object 
	}
	
	static void calculate_sum()
	{
		System.out.println("Enter First Number : ");
		num1 = sc.nextInt();
		System.out.println("Enter Second number : ");
		num2 = sc.nextInt();
		System.out.println("Addition =  "+(num1+num2));
		
	}

	static void calculate_sub()
	{
		System.out.println("Enter First Number : ");
		num1 = sc.nextInt();
		System.out.println("Enter Second number : ");
		num2 = sc.nextInt();
		System.out.println("Subtraction =  "+(num1-num2));
		
	}

	
	public static void main(String[] args) 
	{
		Day5_1.calculate_sum(); // VALID 
		Day5_1.calculate_sub();  // VALID 
		//calculate_sum(); //valid 
		//calculate_sub();  //valid 
		
	}

}
