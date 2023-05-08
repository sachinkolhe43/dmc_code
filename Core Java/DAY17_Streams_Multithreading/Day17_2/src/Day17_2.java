import java.util.Arrays;
import java.util.List;

public class Day17_2 {

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(11,2,30,40);
		System.out.println(list.stream()
		.map(x -> x*x)
		.mapToInt(x-> x*1)
		.min());
		//.average());
		//.max());
	}
}

		
/*
// stream of numbers , sum of squares of those numbers
// 

public class Day17_2 {

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(1,2,3,4);
		
		int sum = list.stream()
				.map(x -> x*x)
				.reduce((x, y) -> x + y )
				.get();
		
		System.out.println("Sum = "+sum);
	}
}
*/


/*
public class Day17_2 {

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(1,2,3,4);
		
		System.out.println(list.stream()
		.mapToInt(x -> x*x)
		.sum());
		
	}

}

*/



/*
public class Day17_2 {

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(1,2,3,4);
		
		System.out.println(list.stream().map( x -> x * x)
		.mapToInt(x -> x*1)
		.sum());
		
	}

}

*/