import java.util.Arrays;
import java.util.List;

public class Day16_5 {

	public static void main(String[] args) 
	{
		List<Integer> l1 = Arrays.asList(10,20,30,40);
		System.out.println("Printing the data using lambda expression");
		l1.forEach(x -> System.out.println(x));
		
		System.out.println("Printing the data using Mathod Reference ");
		l1.forEach(System.out::println);
	
	}

}
