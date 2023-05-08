import java.util.ArrayList;
import java.util.Vector;
//Vector Example
//addElement()
//removeElement()
// addElementAt()
//removeElementAt()
//clone(), contains(), elementAt()

public class Day12_8 {

	public static void main(String[] args) 
	{
		Vector<Integer> vec = new Vector<Integer>();
		vec.addElement(11);
		vec.addElement(12);
		vec.addElement(13);
		vec.addElement(14);
		vec.addElement(15);
		System.out.println("Vec = "+vec );
		vec.add(3,99);
		System.out.println("Vec = "+vec );
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(111);
		al.add(222);
		vec.addAll(al);
		System.out.println("Vec = "+vec );
		Vector<Integer> v2 = (Vector<Integer>) vec.clone();
		System.out.println("Vec V2= "+v2);
		v2.addElement(333);
		System.out.println("V1 = "+vec);
		System.out.println("V2 = "+v2);
		System.out.println("Contains 222 = "+vec.contains(222));
		System.out.println("Element at location 4th = "+vec.elementAt(4));
		
	}

}
