import java.util.ArrayList;
import java.util.Collections;


// Collections.sort()

public class Day13_4 {

	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Sunbeam");
		al.add("Dmc");
		al.add("Akshita");
		al.add("Trainer");
		System.out.println("Before Sort List = "+al);
		Collections.sort(al);
		System.out.println("After Sort List = "+al);
		

	}
}


/*
public class Day13_4 {

	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(2);
		al.add(4);
		al.add(20);
		System.out.println("Before Sort List = "+al);
		Collections.sort(al);
		System.out.println("After Sort List = "+al);
		

	}

}
*/