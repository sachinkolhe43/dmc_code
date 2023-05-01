import java.util.function.BiFunction;

// Method reference to static method of the class

class Multiplication
{
	public static int multiply(int a,int b)
	{
		return a*b;
	}
}

public class Day16_2 
{

	public static void main(String[] args) 
	{
		BiFunction<Integer,Integer,Integer> ref = Multiplication::multiply;
		int result = ref.apply(11, 2);
		System.out.println("Result "+result);
	}
}


/*
public class Day16_2 
{

	public static void main(String[] args) 
	{
		int result = Multiplication.multiply(5, 4);
		System.out.println("Result = "+result);
	}

}
*/