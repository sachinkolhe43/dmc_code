import java.util.TreeMap;

//TreeMap
// Sorted and unordered 
//sorted based on key values
// It does not allow null key 
//or else it throws NullPointerExcption(NPE)
// it allows one or more null values

public class Day13_3 {

	public static void main(String[] args)
	{
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		System.out.println("Tree Map Contents = "+tm);
		tm.put(10, "R1");
		tm.put(5, "R2");
		tm.put(8, "R3");
		tm.put(12, "R4");
		tm.put(15, "R5");
		tm.put(4, "R6");
		//tm.put(null, null); // NPE 
		//tm.put(null, "R12"); // NPE 
		tm.put(33, null); 
		tm.put(77, null);
		System.out.println("Tree Map Contents = "+tm);
		System.out.println("Tree Map Size = "+tm.size());
		System.out.println("First key = "+tm.firstKey());
		System.out.println("Get = "+tm.get(12));
		System.out.println("Last key = "+tm.lastKey());
		
	}

}
