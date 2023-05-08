import java.util.LinkedHashMap;


//LinkedHashMap
//predictable iteration order.
// Unsorted and Ordered
// it allows one key as a  "null"
//it allows null value 
//multiple null values are also allowed with unique key


public class Day13_2 {

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
		System.out.println("Linked Hash Map = "+lhm);
		lhm.put(12, "s1");
		lhm.put(10, "s2");
		lhm.put(5, "s3");
		lhm.put(4, "s4");
		lhm.put(16, "s5");
		System.out.println("Linked Hash Map = "+lhm);
		System.out.println("Linked Hash Map Size= "+lhm.size());
		System.out.println("Get = "+lhm.get(5));
		System.out.println("Get = "+lhm.get(55));
		lhm.put(null, "test");
		System.out.println("Linked Hash Map = "+lhm);
		lhm.put(null, "temp");
		System.out.println("Linked Hash Map = "+lhm);
		lhm.put(44, null);
		System.out.println("Linked Hash Map = "+lhm);
		lhm.put(88, null);
		System.out.println("Linked Hash Map = "+lhm);
		
	}

}
