import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;



//Fail- Safe Iterator 
public class Day12_11 
{

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<Integer>();
		vec.addElement(11);
		vec.addElement(22);
		vec.addElement(33);
		vec.addElement(44);
		vec.addElement(55);
		System.out.println("Vector Elements "+vec);
		
		Enumeration<Integer> itr = vec.elements();
		Integer element =0;
		while(itr.hasMoreElements())
		{
			element = itr.nextElement();
			System.out.println(element);
			if(element == 33)
				vec.add(888);
				
		}
		System.out.println("Vector = "+vec);
		
		
	}
	
}


/*

//Fail- Fast Iterator 
public class Day12_11 
{

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<Integer>();
		vec.addElement(11);
		vec.addElement(22);
		vec.addElement(33);
		vec.addElement(44);
		vec.addElement(55);
		System.out.println("Vector Elements "+vec);
		
		Iterator<Integer> itr = vec.iterator();
		Integer element =0;
		while(itr.hasNext())
		{
			element = itr.next();
			System.out.println(element);
			if(element == 44)
				vec.add(999);
				
		}
		System.out.println("Vector = "+vec);
		
		
	}
	
}

*/

