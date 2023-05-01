import java.util.Arrays;
import java.util.List;

//Can we use local variables in Lambda?? YES
// Local variable capture example in lambda

public class Day15_4 
{

	public static void main(String[] args) 
	{
		List<Integer> l1 = Arrays.asList(11,22,33,44);
		int var = 25;
		l1.forEach( (Integer x) -> {
			int y = x + var;
			System.out.println("Value "+y);
		});
		
	}
}





// requirement
// take each element from collection
// we wish to multiply each element by 2
// display the result



/*

// parameter type is mentioned explicitly in lambda


public class Day15_4 
{

	public static void main(String[] args) 
	{
		List<Integer> l1 = Arrays.asList(11,22,33,44);
		l1.forEach( (Integer x) -> {
			int y = x * 3;
			System.out.println("Value "+y);
		});
		
	}
}

*/




/*
//can lambda consist of multiple statements?? YES
// can lambda consist of local variable declarations ? YES
// Lambda Expression with one local variable
public class Day15_4 
{

	public static void main(String[] args) 
	{
		List<Integer> l1 = Arrays.asList(11,22,33,44);
		l1.forEach(x -> {
			int y = x * 2;
			System.out.println("Value "+y);
		});
		
	}
}

*/

/*
public class Day15_4 
{

	public static void main(String[] args) 
	{
		List<Integer> l1 = Arrays.asList(11,22,33,44);
		//System.out.println(l1); // l1.toString() ===> String
		
		// specify what is to be done ?? how it is to be done?
		//for(Integer i : l1)
			//System.out.println(i);
		
		
		// specify what is to be done? 
		l1.forEach(x -> System.out.println(x));
		//l1.forEach(lambda expression)
	}

}
*/
