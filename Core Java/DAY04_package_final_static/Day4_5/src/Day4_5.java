//final field

class Test
{
	final int val = 50; // val is field of Test class
	// final field must be initialized at the time of declaration
	void disp()
	{
		System.out.println("Value = "+val);
		//val++; // javac error 
	}
}
public class Day4_5 {

	public static void main(String[] args) 
	{
		Test tobj=new Test();
		tobj.disp();
	}

}
