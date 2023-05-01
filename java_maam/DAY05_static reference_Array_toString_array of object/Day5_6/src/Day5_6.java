import java.util.Scanner;

//advanced for loop
// for each loop
// used only for displaying the elements 
// traversing in an array from first element to last element
// it works as a iteration from first to last element
// we can not access random elements using for each loop
// mostly used in all collections



public class Day5_6 {

	public static void main(String[] args) 
	{
		int a1[]= {11,22,33,44,55,66};
		int a2[]=a1; // REFERENCE COPY 
		System.out.println(a1);
		System.out.println(a2);
	
	}
}



/*

public class Day5_6 {

	public static void main(String[] args) 
	{
		float farr[]=new float[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the float array data");
		for(int i=0;i<farr.length;i++)
			farr[i]=sc.nextFloat();
		System.out.println("\n Array elements are \n");
		for(float f : farr)
			System.out.print(f+"\t");
		
		System.out.println("\n"+farr.toString()); //[F@hashcode
		System.out.println("Get Class "+farr.getClass()); // [F
		
	}
}

*/





/*
public class Day5_6 {

	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50};
		System.out.println("Display array elements using for-each loop");
		
		//for each element "i" of type "int" 
		//in an array "arr" 
		//display the element "i"
		
		// i = arr[0]  = 10
		// i = arr[1] = 20
		//i = arr[2] = 30
		//i = arr[3] = 40
		// i = arr[4] = 50
		// loop will traverse from i = 0 till length-1 elements 
		for(int i : arr)
			System.out.print(i+"\t");
		
		

	}

}
*/