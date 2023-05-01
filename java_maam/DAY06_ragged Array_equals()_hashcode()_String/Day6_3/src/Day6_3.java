import java.util.Arrays;
//reference copy and instance copy


public class Day6_3 {

	public static void main(String[] args) 
	{
		int a1[][]=new int[][] {{250,10},{130,40}};
		int a2[][]=a1;
		System.out.println(a1+"\t"+a2); // reference copy //shallow copy
		System.out.println(Arrays.toString(a1[0])+"\t"+Arrays.toString(a1[1]));
		System.out.println(Arrays.toString(a2[0])+"\t"+Arrays.toString(a2[1]));
		
		a1[0][0]=99;
		System.out.println(Arrays.toString(a1[0])+"\t"+Arrays.toString(a1[1]));
		System.out.println(Arrays.toString(a2[0])+"\t"+Arrays.toString(a2[1]));
		
		
		
		int a3[][]= new int[][] {{99,88},{10,12}};
		int a4[][]=Arrays.copyOf(a3, 7); // instance copy
		// member by member copy // shallow copy 
		System.out.println(a3+"\t"+a4); 
		
		System.out.println(Arrays.toString(a3[0])+"\t"+Arrays.toString(a3[1]));
		System.out.println(Arrays.toString(a4[0])+"\t"+Arrays.toString(a4[1]));
		a3[0][0]=555;
		
		System.out.println(Arrays.toString(a3[0])+"\t"+Arrays.toString(a3[1]));
		System.out.println(Arrays.toString(a4[0])+"\t"+Arrays.toString(a4[1]));
		
		
		
		

	}

}
