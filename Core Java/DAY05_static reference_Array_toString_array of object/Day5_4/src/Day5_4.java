
public class Day5_4 {

	public static void main(String[] args)
	{
		//int a[5]= {10,20,30,40,50}; //In Valid // javac error 
		
		//int a[]=new int[-5]; // no javac error // but it is an Exception
		// NegativeArraySizeException (run time exception)
		
		//int a[]=new int[0]; // Not Recommended 
		
		//int a[]=null; // VALID // null reference 
		// when we try to access or modify the elements of null reference
		// NPE 
		//Taking the length of null as if it were an array.
		//Accessing or modifying the slots of null as if it were an array.
				
		
		
		int a[]= {10,20,30,40};
		
		for(int i = 0 ;i<a.length;i++)
			System.out.print(a[i]+"\t");
		System.out.println("\n Element at index 2 =  "+a[2]);
		
		
		System.out.println("\n element at index 5 = "+a[5]); //Exception
		//java.lang.ArrayIndexOutOfBoundsException		
		//Thrown to indicate that an array has been accessed with an illegal index. 
		//The index is either negative or greater than or equal to the size of the array.
	
	
	}
}




/*
public class Day5_4 {

	public static void main(String[] args)
	{
		int a[]= {10,20,30,40,50}; // Valid // array initialization 
		for(int i = 0 ;i<a.length;i++)
			System.out.print(a[i]+"\t");
	}
}

*/

/*
public class Day5_4 {

	public static void main(String[] args)
	{
		int a[]=new int[5]; //valid 
		a[0] = 11; 
		a[1] = 22;
		a[2] = 33;
		a[3] = 44; 
		a[4] = 55;
		for(int i = 0 ;i<a.length;i++)
			System.out.print(a[i]+"\t"); // AutoUnboxing 
		System.out.println();
		System.out.println(a);
	
	}

}

*/