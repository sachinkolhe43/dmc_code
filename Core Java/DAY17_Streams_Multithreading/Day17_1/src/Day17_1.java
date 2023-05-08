import java.util.Arrays;
import java.util.List;

public class Day17_1 {

	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(11,22,33,44,55,66,77,88,99,100);
		numbers.stream()  
		.map(number -> number %2 ==0) 
		.forEach(System.out::println);  
	}

}



/*

//stream ==> filter ==> forEach()


public class Day17_1 {

	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(11,22,33,44,55,66,77,88,99,100);
		numbers.stream()  
		.filter(number -> number %2 ==0) 
		.forEach(System.out::println);  
	}

}
/*

//numbers list
//finding even numbers
//represent them as integer values by multiplying each element by 2
//represent sum of those numbers

//stream ==> filter ==> mapToInt() ==> count()


public class Day17_1 {

	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(11,22,33,44,55,66,77,88,99,100);
		System.out.println(numbers.stream()  
		.filter(number -> number %2 ==0) 
		.count());  // count() is also terminal operation
	}

}

*/


/*
// numbers list
// finding even numbers
// represent them as integer values by multiplying each element by 2
// represent sum of those numbers

// stream ==> filter ==> mapToInt() ==> sum()


public class Day17_1 {

	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(11,22,33,44,55,66,77,88,99,100);
		System.out.println(numbers.stream()  
		.filter(number -> number %2 ==0) 
		.mapToInt(e -> e * 2) 
		.sum()); 
	}

}

*/
