import java.util.Scanner;

// reverse a number

public class Day7_4 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Please enter a number ");
		num = sc.nextInt();
		System.out.println("Original Number = "+num);
		
		// can we convert int to String?? valueOf() ==> P to NP 
		// Boxing
		String str = String.valueOf(num); 
		
		StringBuffer sb1= new StringBuffer(str); // String to StringBuffer 
		System.out.println("Sb1 = "+sb1); 
		sb1.reverse(); // reverse() is belongs to StringBuffer class
		System.out.println("Sb1 = "+sb1);
		
		
	}
	
}


/*
public class Day7_4 {

	public static void main(String[] args) 
	{
		StringBuffer sb1=new StringBuffer("1234");
		sb1.reverse();
		System.out.println(sb1);
	}

}
*/
