import java.util.Arrays;
import java.util.Scanner;

//Requirement
// take the array length from user
// then accept and display the elements


public class Day5_8 {

	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array ");
		n= sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Please enter the array elements");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.println("Display the array elements "+Arrays.toString(arr));
		
	}

}
