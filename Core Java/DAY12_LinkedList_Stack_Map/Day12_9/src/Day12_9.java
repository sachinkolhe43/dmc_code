import java.util.Vector;

//public void trimToSize()
//Trims the capacity of this vector to be the vector's current size. 

public class Day12_9 {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<Integer>(12);
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		vec.addElement(90);
		vec.addElement(85);
		vec.addElement(55);
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		vec.trimToSize(); // method used for shrinking the vector 
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		
	}

}
