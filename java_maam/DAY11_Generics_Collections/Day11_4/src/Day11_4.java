//generic method 
public class Day11_4
{

	static <T> void display(T value) // display method taking generic type parameter
	{
		System.out.println("Value = "+value);
	}
	
	public static void main(String[] args) 
	{
		display(45); // 45 ===> T ===> NP ==> Integer
		display(6.5); // 6.5 ==> T ===> NP ===> Double 
		display(5.5f);
		display("sunbeam");
	}

}
