
public class Day10_7
{

	public static void main(String[] args) 
	{
	
		int data[]= {10,20,30,40,50};
	try
	{
		System.out.println("data[0] = "+data[0]);
		System.out.println("data[8] = "+data[8]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Supplied Index is not correct");
		System.out.println("E = "+e);
		System.out.println("Localized msg = "+e.getLocalizedMessage());
		System.out.println("get messege = "+e.getMessage());
		System.out.println("get cause = "+e.getCause());
		System.out.println("stack trace = "+e.getStackTrace());
		e.printStackTrace();
	}

}

}
