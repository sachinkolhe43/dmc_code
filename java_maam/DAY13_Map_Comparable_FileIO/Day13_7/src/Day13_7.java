
import java.io.File;
import java.io.IOException;

//createNewFile(), mkdir(), delete() 


public class Day13_7 
{

	public static void main(String[] args) 
	{
		File fobj = new File("MyDirectory");
		boolean status = fobj.delete();
		System.out.println("Status = "+status);
	}
}



/*
public class Day13_7 
{

	public static void main(String[] args) 
	{
		File fobj = new File("MyDirectory");
		boolean status = fobj.mkdir();
		System.out.println("Status = "+status);
	}
}
*/





/*

//delete()
public class Day13_7 
{

	public static void main(String[] args) 
	{
		File fobj = new File("Test.txt");
		boolean status = fobj.delete();
		System.out.println("Status = "+status);
	}

}

*/




/*
//creating a new file

public class Day13_7 
{

	public static void main(String[] args) throws IOException
	{
		File fobj = new File("Test.txt");
		boolean status = fobj.createNewFile();
		System.out.println("Status = "+status);
	}

}

*/
