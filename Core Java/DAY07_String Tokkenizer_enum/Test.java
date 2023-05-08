enum Color
{
	RED,GREEN,BLUE;
}

public class Test {

	public static void main(String[] args) 
	{
		System.out.println(Color.RED +" "+ Color.RED.toString() + " "+ Color.RED.ordinal());
		System.out.println(Color.GREEN +" "+ Color.GREEN.toString() + " "+ Color.GREEN.ordinal());
		System.out.println(Color.BLUE + " " +Color.BLUE.toString() + " "+Color.BLUE.ordinal());
	}

}
