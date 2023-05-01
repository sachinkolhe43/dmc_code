package p1;

// NetworkPrinter class is implementing the interface Printer
// means the function definition is implemented inside the class
//  NetworkPrinter , for those functions which are declared
// inside the Printer interface

public class NetworkPrinter implements Printer
{
	public void print(String msg) // overridden method
	{
		System.out.println("Inside Network Printer "+msg);
	}
}
