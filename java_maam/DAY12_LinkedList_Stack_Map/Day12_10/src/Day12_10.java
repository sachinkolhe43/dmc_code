import java.util.Enumeration;
import java.util.Vector;

public class Day12_10 
{

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<Integer>();
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		vec.addElement(11);
		vec.addElement(22);
		vec.addElement(33);
		vec.addElement(44);
		vec.addElement(55);
		System.out.println("Print Vector elements toString = "+vec.toString());
		
		System.out.println("Print the elements using for each");
		for(Integer i : vec)
			System.out.print(i+"\t");
		
		// normal for loop ==> vec.size()
		// iterator() ===> hasNext() , next()
		// listIterator(index)==> hasNext(), next(), hasPrevious(), previous()
		
		System.out.println("\n Printing elements using enumeration");
		Enumeration<Integer> e = vec.elements(); 
		while(e.hasMoreElements())
			System.out.print(e.nextElement()+"\t");
	
	}
}
