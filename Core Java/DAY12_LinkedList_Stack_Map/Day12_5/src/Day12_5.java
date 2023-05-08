import java.util.LinkedList;
import java.util.ArrayList;
// Convert a LinkedList to array (using toArray())
public class Day12_5 {

	public static void main(String[] args)
	{
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("DMC");
		l1.add("DAC");
		l1.add("DITISS");
		l1.add("DBDA");
		l1.add("DMC");
		
		System.out.println("LL = "+l1+" Get Class = "+l1.getClass());
		
		//public <T> T[] toArray(T[] a)
		//T as String
		// public <String> String[] toArray(String[] a)
		
		String arr[]= l1.toArray(new String[l1.size()]);
		System.out.println("Arr Get class ="+arr.getClass());
		for(String s : arr)
			System.out.print(s+"\t");
		
		
		
		
		
		
	
	}
}


