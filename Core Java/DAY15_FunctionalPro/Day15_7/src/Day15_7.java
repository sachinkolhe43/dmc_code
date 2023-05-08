

//lambda expression without any parameters
@FunctionalInterface
interface Name
{
	public String getName();
}


public class Day15_7 {

	public static void main(String[] args) 
	{
		Name ref = () -> {return "Hello Everyone!!";};
		System.out.println(ref.getName());
	}

}
