import java.io.File;
import java.io.IOException;

// Fetching the information about the file
// Metadata about the file

public class Day13_8 {

	public static void main(String[] args) throws IOException 
	{
		File fobj=new File("Demo.txt");
		System.out.println("Exists = "+fobj.exists());
		System.out.println("Get Absoulte path = "+fobj.getAbsolutePath());
		
		System.out.println("Get Canonical Path ="+fobj.getCanonicalPath());
		System.out.println("Get Name = "+fobj.getName());
		System.out.println("Path = "+fobj.getPath());
		System.out.println("Parent = "+fobj.getParent());
		System.out.println("get space = "+fobj.getTotalSpace());
		System.out.println("Is File ??"+fobj.isFile());
		System.out.println("Is Directory ? "+fobj.isDirectory());
		System.out.println("Length = "+fobj.length());

	}

}
