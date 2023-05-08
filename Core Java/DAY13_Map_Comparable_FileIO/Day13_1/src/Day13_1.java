import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;



//HashTable


public class Day13_1 {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		System.out.println("Ht = "+ht);
		ht.put(10, "emp1");
		ht.put(2, "emp2");
		ht.put(23, "emp3");
		ht.put(14, "emp4");
		ht.put(25, "emp5");
		ht.put(22,"emp5");
		System.out.println("Ht = "+ht);
		
		System.out.println("Fetching the keys from Hashtable");
		Set<Integer> s = ht.keySet();
		//keySet() returns  keys from hashtable
		// and we know keys are unique
		//so its return type is Set collection because Set allows unique elements
		for(Integer key : s)
			System.out.print(key+"\t");
		
		System.out.println("\n Fetching the values from Hashtable");
		Collection<String> c  =ht.values();
		for(String str : c)
			System.out.print(str+"\t");
		
		
	}
}



/*
//which maps keys to values. 
//Any non-null object can be used as a key or as a value.
// Unsorted and Unordered
//Keys must be unique , and if we supply two or more values on same key
// it will be overwritten
//values can be repeated 
//put() , size() 

public class Day13_1 {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		System.out.println("Ht = "+ht);
		ht.put(10, "emp1");
		ht.put(2, "emp2");
		ht.put(23, "emp3");
		ht.put(14, "emp4");
		ht.put(25, "emp5");
		System.out.println("Ht = "+ht);
		System.out.println("Ht Size = "+ht.size());
		ht.put(25, "temp");
		System.out.println("Ht = "+ht);
		ht.put(35, "emp1");
		
		System.out.println("Ht = "+ht);
		

	}

}
*/