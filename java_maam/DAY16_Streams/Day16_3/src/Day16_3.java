import java.util.Arrays;

//Method reference to arbitrary object of particular type

public class Day16_3 {

	public static void main(String[] args)
	{
		String sarr[]= {"Sunbeam","Akshita","Trainer","Dmc"};
		System.out.println(Arrays.toString(sarr));
		Arrays.sort(sarr,String::compareTo);
		//compareTo is a method whose reference is stored by sarr 
		//compareTo method is defined in String class
		// classname :: methodname 
		
		System.out.println(Arrays.toString(sarr));
	}

}
