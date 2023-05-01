import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

// Create a collection AL
//add elements in AL
// convert AL to stream
// print square of each element in stream

public class Day16_7 {

	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 1,2,3,4,5,6);
		list.stream().map(d -> d*d).forEach(s-> System.out.println(s));
		
		
	}
}



/*
//convert an array in stream and print the data
//streams can not be reused once processed
// else it will throw IllegalStateException

public class Day16_7 {

	public static void main(String[] args)
	{
		Integer[] arr = {1,2,3,4,5,6,7,8};
		Stream<Integer> s = Stream.of(arr);
		s.forEach(val -> System.out.println(val));
		s.forEach(System.out::println);
		
	}
}
*/


/*
//convert an array in stream and print the data

public class Day16_7 {

	public static void main(String[] args)
	{
		Integer[] arr = {1,2,3,4,5,6,7,8};
		System.out.println("Printing the stream using Method Referece ");
		Stream.of(arr).forEach(System.out::println);  // MR 
		System.out.println("Printing the stream using Lambda");
		Stream.of(arr).forEach(s-> System.out.println(s)); // Lambda
	}

}
*/