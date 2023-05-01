import java.util.ArrayList;
import java.util.Vector;

// Demo of constructors of Vector class


public class Day12_7 {

	public static void main(String[] args)
	{
		Vector<Integer> vec = new Vector<Integer>(8,3);
		
		//Vector(int initialCapacity, int capacityIncrement)
		//Constructs an empty vector with the specified initial capacity 
		//and capacity increment
			
		
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		vec.add(60);
		vec.add(70);
		vec.add(80);
		
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		
		vec.add(90);
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		
	}
}

/*

public class Day12_7 {

	public static void main(String[] args)
	{
		Vector<Integer> vec = new Vector<Integer>(5);
		//public Vector(int initialCapacity)
		//Constructs an empty vector with the specified initial capacity 
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		
		vec.add(60);
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		
	}
}
*/


/*
public class Day12_7 {

	public static void main(String[] args)
	{
		Vector<Integer> vec = new Vector<Integer>();
		//Constructs an empty vector so that its internal data array has size 10 
		//and its standard capacity increment is zero.
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		
		vec.add(11);
		vec.add(22);
		vec.add(33);
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		vec.addElement(44);
		vec.addElement(55);
		vec.addElement(66);
		vec.addElement(77);
		vec.addElement(88);
		vec.addElement(99);
		vec.addElement(111);
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		vec.addElement(222);
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		System.out.println("Vector Contents are = "+vec);
	}

}



*/