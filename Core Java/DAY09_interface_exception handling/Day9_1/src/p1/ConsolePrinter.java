package p1;

public class ConsolePrinter implements Printer
{
	public void print(String msg) // // overridden method
	{
		System.out.println("Inside console printer class "+msg);
	}
}
