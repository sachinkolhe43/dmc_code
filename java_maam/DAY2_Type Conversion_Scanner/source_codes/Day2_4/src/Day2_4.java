
// supply a command line argument 
// take input in int value

// take input from cmd line argument 3 numbers
// and display addition

public class Day2_4 {

	public static void main(String[] args) 
	{
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		int n3=Integer.parseInt(args[2]);
		System.out.println("Addition = "+(n1+n2+n3));
		
	}
}



/*

public class Day2_4 {

	public static void main(String[] args) 
	{
		//Convert String to int
		// parseInt() ===> Integer
		// parseFloat() ==> Float
		// parseDouble() ==> Double 
		int marks = Integer.parseInt(args[0]);  //String to int
		float fval = Float .parseFloat(args[1]); //String to float
		double percentage  = Double.parseDouble(args[2]);
		
		
		System.out.println("Marks = "+marks);
		System.out.println("Fval = "+fval);
		System.out.println("Percentage = "+percentage);

	}

}
*/


/*
public class Day2_4 {

	public static void main(String[] args) 
	{
		int marks = args[0]; // javac error // Type Mismatch
		//args[0] is of type String
		//we are storing in int 
		
		System.out.println("Marks = "+marks);

	}

}
*/