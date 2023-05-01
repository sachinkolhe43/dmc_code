import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//set : contains no duplicate elements
//HashSet, TreeSet, and LinkedHashSet.


//TreeSet ===> UnOrdered , Sorted 
//no duplicates are allowed
//does not allow "null" value ,it throws NPE

public class Day12_14 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(5);
		ts.add(3);
		ts.add(8);
		ts.add(1);
		ts.add(6);
		System.out.println("Tree Set = "+ts);
		ts.add(3);
		System.out.println("Tree Set = "+ts);
		//ts.add(null); // throw NPE 
		//System.out.println("Tree Set = "+ts);
		
	}

}



/*
//LinkedHashSet ===> Ordered , UnSorted 
//no duplicates are allowed
//one "null" value is allowed

public class Day12_14 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		hs.add(5);
		hs.add(3);
		hs.add(8);
		hs.add(1);
		hs.add(6);
		System.out.println("Linked Hash Set = "+hs);
		hs.add(3);
		System.out.println("Linked Hash Set = "+hs);
		hs.add(null);
		System.out.println("Linked Hash Set = "+hs);
		
	}

}

*/


/*
//HashSet ===> Unordered , Sorted 
//no duplicates are allowed
// one "null" value is allowed
public class Day12_14 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(5);
		hs.add(3);
		hs.add(8);
		hs.add(1);
		hs.add(6);
		System.out.println("Hash Set = "+hs);
		hs.add(3);
		System.out.println("Hash Set = "+hs);
		hs.add(null);
		System.out.println("Hash Set = "+hs);
		
		

	}

}

*/
