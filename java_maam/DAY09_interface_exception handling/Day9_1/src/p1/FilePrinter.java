package p1;

public class FilePrinter implements Printer
{
	public void print(String msg) // overridden method
	{
		System.out.println("Inside File Printer class ");
		System.out.println("Messege = "+msg);
		// fetch the fields of interface in the implemented class
		System.out.println("Data = "+DATA);
	}
	
	//can we add other functionality in the class who implements interface??
	// YES 
	
	void test() // non overridden method
	{
		System.out.println("Inside test function of file printer class");
		
	}
	
}
