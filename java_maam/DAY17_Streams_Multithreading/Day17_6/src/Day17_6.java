import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//flatMap

public class Day17_6 {

	public static void main(String[] args)
	{
		List<Integer> primenumber = Arrays.asList(5,7,11,13);
		List<Integer> evennumber = Arrays.asList(2,4,6,8);
		List<Integer> oddnumber = Arrays.asList(1,3,5,7,9);
		
		List<List<Integer>> l1 = Arrays.asList(primenumber,evennumber,oddnumber);
		System.out.println("Before Flat Map");
		System.out.println(l1);
		
		//flatMap to transofrm and flattening the data
		List<Integer> l2=l1.stream()
		.flatMap(l -> l.stream())
		.collect(Collectors.toList());
		System.out.println("After Flat Map");
		System.out.println(l2);
		
	}
}




/*
// create a list of strings
// fetch the second character from each string in collection

public class Day17_6 {

	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("DMC","Akshita","corejava","python");
		list.stream().flatMap(str -> Stream.of(str.charAt(2))).forEach(System.out::println);
	}
}

*/

/*
//flatMap()
//flatMap(Function mapper)

public class Day17_6 {

	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("9.3","4.3","5.2");
		System.out.println(list.stream().flatMap(num -> Stream.of(num)).count());
		//.forEach(System.out::println);
		
	}

}

*/


/*
public class Day17_6 {

	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("9.3","4.3","5.2");
		list.stream().flatMap(num -> Stream.of(num))
		.forEach(num -> System.out.println(num));
		
	}

}
*/
