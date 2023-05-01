import java.util.Arrays;
import java.util.Scanner;

//2D Array 

public class Day6_1 {

	public static void main(String[] args) 
	{
			int a[][]= new int[4][2];
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the elements of an array : ");
			//a[0][0] a[0][1] ==>row-0
			//a[1][0] a[1][1] ==> row -1
			//a[2][0] a[2][1] ==> row -2
			//a[3][0] a[3][1] ==>row-3
			
			//nested for loop
			// outer loop represents row
			//inner loop represent col
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<2;j++)
				{
					a[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("Array elements are = "+Arrays.toString(a));
		//	System.out.println("a[0]= "+Arrays.toString(a[0]));
		//	System.out.println("a[0]= "+Arrays.toString(a[1]));
			//System.out.println("a[0]= "+Arrays.toString(a[2]));
			//System.out.println("a[0]= "+Arrays.toString(a[3]));
			
			//for(int i=0;i<4;i++)
				//System.out.println(Arrays.toString(a[i]));
			
			
			System.out.println("Array Elements are ");
			
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.print(a[i][j]+"\t");
				}
				System.out.println();
			}
			
			
			
			
			
			

	}

}
