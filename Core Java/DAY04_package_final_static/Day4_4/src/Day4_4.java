import java.util.Scanner;

//final variable

//final variables data can be taken as input from user 
public class Day4_4 {

	public static void main(String[] args) 
	{
		final float PI; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the PI value");
		PI=sc.nextFloat();
		System.out.println("PI = "+PI);
		//PI++; // javac error / /we can not modify constant data
		
	}

}




/*
public class Day4_4 {

	public static void main(String[] args) 
	{
		final float PI = 3.14f; // final declares the variable as constant
		System.out.println("PI = "+PI);
		//PI++; // javac error / /we can not modify constant data
		
	}

}

*/
