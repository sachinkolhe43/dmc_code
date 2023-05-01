import java.util.stream.Stream;

// Requirement
// stream operations
//declare one int array consist of some elements
// convert array in stream
// find even numbers
// map each value with "DMC"
// convert each value to lower case 
// finally print the stream


public class Day16_6 
{

	public static void main(String[] args) 
	{
		Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
		Stream.of(arr)
		.filter(i-> i%2==0)
		.map(i-> "DMC"+i)
		.map(s-> s.toLowerCase())
		.forEach(s -> System.out.println(s));

	}
}



/*
public class Day16_6 
{

	public static void main(String[] args) 
	{
		Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
		Stream<Integer> stream1 = Stream.of(arr);
		System.out.println(stream1);
		Stream<Integer> stream2 = stream1.filter(i -> i%2 ==0 );
		Stream<String> stream3 = stream2.map(i -> "DMC"+i);
		Stream<String> stream4 = stream3.map(s -> s.toLowerCase());
		//stream4.forEach(s -> System.out.println(s)); // lambda
		stream4.forEach(System.out::println); // method reference
 		
	}

}

*/
