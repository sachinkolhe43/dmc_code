
import java.util.Arrays;
import java.util.Scanner;

//2D Array 

public class Day6_2 {

	public static void main(String[] args) 
	{
			//int a[][]= {{1,2,3},{4,5,6},{7,8,9}}; //valid declaration 
			Scanner sc=new Scanner(System.in);
			int a[][] = new int[3][3];
			System.out.println("Enter array elements ");
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("Printing array elements using for-each loop");
			for(int row[] :a)
			{
				for(int element:row)
				{
					System.out.print(element+"\t");
			
				}
			}
			
			

			
			
		
	}
}
