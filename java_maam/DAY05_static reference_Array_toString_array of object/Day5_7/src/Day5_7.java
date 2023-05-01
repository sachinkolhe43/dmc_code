//Array and functions
//call by reference concept
// AutoBoxing and AutoUnboxing

import java.util.Scanner;




public class Day5_7 
{
	static Scanner sc;
	
	static 
	{
		sc=new Scanner(System.in);
	}
	
	private static void accept_arr(int[] arr)  // reference copy
	{
		if(arr!=null)
		{	
			System.out.println("Enter the array elements ");
		
			for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		}
		else
			System.out.println("Array is declared as null");
	}
	
	
	private static void disp_arr(int[] arr) //reference copy
	{
		if(arr!=null)
		{
			System.out.println("\n Array elements are : ");
			for(int i : arr)
				System.out.print(i+"\t");
		}
		else
			System.out.println("Array is null");
	}


	public static void main(String[] args) 
	{
		int a[]=null;
		int b[]=null;
		
		accept_arr(a); // call by reference 
		accept_arr(b); // call by reference
			
		disp_arr(a); // call by reference
		disp_arr(b); // call by reference
		
	}

	

}



/*

public class Day5_7 
{
	static Scanner sc;
	
	static 
	{
		sc=new Scanner(System.in);
	}
	
	private static void accept_arr(int[] arr)  // reference copy
	{
		System.out.println("Enter the array elements ");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
	}
	
	
	private static void disp_arr(int[] arr) //reference copy
	{
		System.out.println("\n Array elements are : ");
		for(int i : arr)
			System.out.print(i+"\t");
	}
	


	public static void main(String[] args) 
	{
		int a[]=new int[5];
		int b[]=new int[5];
		int c[] = new int[5];
		accept_arr(a); // call by reference 
		accept_arr(b); // call by reference
		
		for(int i=0;i<c.length;i++)
			c[i]=a[i]+b[i];
		
		
		disp_arr(a); // call by reference
		disp_arr(b); // call by reference
		disp_arr(c);// call by reference
	}

	

}
*/