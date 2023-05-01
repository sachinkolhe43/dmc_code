
//Method reference to the instance of object

@FunctionalInterface
interface Calculate
{
	void execute();
}


public class Day15_11 
{
	
	public void sum()
	{
		int num1=20;
		int num2=10;
		System.out.println("Addition = "+(num1+num2));
	}
	
	
	public void sub()
	{
		int num1=50;
		int num2=5;
		System.out.println("Subtraction = "+(num1-num2));
	}
	
	public static void main(String[] args) 
	{
		Day15_11 dobj = new Day15_11();
		Calculate calRef = dobj::sum;
	
		//System.out.println(calRef);
		calRef.execute();
		
		calRef = dobj::sub;
		calRef.execute();
		
	}

}
