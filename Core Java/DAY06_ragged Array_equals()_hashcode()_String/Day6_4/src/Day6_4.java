//Ragged array

public class Day6_4 {

	public static void main(String[] args) 
	{
		int a[][]=new int[3][];
		//a[0] = new int[2]; // declaration row 0 will have 2 elements  
		//a[1] = new int[3]; // declaration row 1 will have 3 elements  
		//a[2] = new int[4]; // declaration row 2 will have 4 elements  
		
		a[0] = new int[] {10,20}; //intialization row 0 will have 2 elements having data as 10 20  
		a[1] = new int[] {11,22,33};
		a[2] = new int[] {9,8,7,6};
		
		System.out.println("Length = "+a.length);
		System.out.println("Length a[0] = "+a[0].length);
		System.out.println("Length a[1] = "+a[1].length);
		System.out.println("Length a[2] = "+a[2].length);

		for(int row[]:a)
		{
			for(int element : row)
			{
				System.out.print(element + "\t");
			}
			System.out.println();
		}
		
	}
	
	
}
