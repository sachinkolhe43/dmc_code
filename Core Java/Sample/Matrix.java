import java.util.Arrays;
import java.util.Scanner;


public class Matrix {
	void add(int a[][],int b[][])
	  {
		
		  int c[][]=new int[3][3];
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<b[i].length;j++)
						{
							c[i][j]=a[i][j]+b[i][j];
						}
			}
			System.out.println("Addition of Matrix is:");
			for(int i=0;i<3;i++)
			{
				System.out.println(Arrays.toString(c[i]));
			}
			
			
		}
	void sub(int a[][],int b[][])
	  {
		
		  int c[][]=new int[3][3];
		  for(int i=0;i<a.length;i++)
		  {
			  for(int j=0;j<b[i].length;j++)
					  {
						  c[i][j]=a[i][j]-b[i][j];
					  }
		  }
		  System.out.println("Subtraction of Matrix is:");

		  for(int arr[]: c)
		  {
			for(int element: arr)
			{
				System.out.print(element+"\t");
			}
			System.out.println();
		  }
		//   for(int i=0;i<3;i++)
		//   {
		// 	  System.out.println(Arrays.toString(c[i]));
		//   }
		  
			
			
		}
	void mul(int a[][],int b[][])
	  {
		
		  int c[][]=new int[3][3];
		  for(int i=0;i<a.length;i++)
		  {
			  for(int j=0;j<b[i].length;j++)
					  {
						  c[i][j]=a[i][j]*b[i][j];

					  }
		  }
		  System.out.println("Multiplication of Matrix is:");
		  for(int i=0;i<3;i++)
		  {
			  System.out.println(Arrays.toString(c[i]));
		  }
		  
			
		}
	void div(int a[][],int b[][])
	  {
		
		  int c[][]=new int[3][3];
		  for(int i=0;i<a.length;i++)
		  {
			  for(int j=0;j<b[i].length;j++)
					  {
						  c[i][j]=a[i][j]/b[i][j];
					  }
		  }
		  System.out.println("Division of Matrix is:");
		  for(int i=0;i<3;i++)
		  {
			  System.out.println(Arrays.toString(c[i]));
		  }
		  
			
		}

	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter Arrays Elements for Array A:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Element Of Array A:");
		for(int i=0;i<a.length;i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j]+"\t");
            }
			System.out.println();

        }
		
		System.out.println("\n Enter Arrays Elements for Array B:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Element Of Array B:");
		for(int i=0;i<a.length;i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                System.out.print(b[i][j]+"\t");
            }
			System.out.println();

        }
		Matrix d1=new Matrix();
		
		
		
		

		do
		{	
			int choice;
			System.out.println("Enter Your Choice: ");
			System.out.println("\n 1. Add \n 2. Subtract \n 3. Multiplication \n 4. Division 5. Exit");
			choice=sc.nextInt();
			switch (choice) {
				case 1:
					d1.add(a,b);
					break;
				case 2:
					d1.sub(a, b);
					break;
				
				case 3:
					d1.mul(a, b);
					break;

				case 4:
					d1.div(a, b);
					break;
				case 0:
		
					break;
				default:

					break;
			}

		}while(true);
		
		
	}
		
		
			
		
  
}
	

