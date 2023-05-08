import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Day17_4 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(25,-1,4,5,6,-5,8,9,20,90);
		list.stream().sorted().forEach(i->System.out.println(i));
		
		List<String> list1 = Arrays.asList("sunbeampune","akshita","trainer");
		list1.stream().sorted().forEach(i->System.out.println(i));
		
	}
}


/*
public class Day17_4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(12);
		
		System.out.println("Generating sequential stream");
		list.stream().forEach(i -> System.out.println(i));
		
		System.out.println("\nGenerating Parallel stream");
		list.parallelStream().forEach(i -> System.out.println(i));
		
		

	}

}
*/
