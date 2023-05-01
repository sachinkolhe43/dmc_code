// functional interface and lambda

@FunctionalInterface
interface Square
{
	public int getArea(int side);
	
}


public class Day15_5 
{

	public static void main(String[] args) 
	{
		Square sq = (side) -> {return side*side;};
		System.out.println("Area = "+sq.getArea(5));
	
	}

}
