import java.util.LinkedList;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;


public class Day12_4 {

	public static void main(String[] args)
	{
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("DMC");
		l1.add("DAC");
		l1.add("DITISS");
		l1.add("DBDA");
		l1.add("DMC");
		l1.add("DESD");
		l1.add(null);
		l1.add("DMC");
		l1.add(null);
		System.out.println("LL = "+l1);
		System.out.println("index of DMC = "+l1.indexOf("DMC"));
		System.out.println("last index of DMC = "+l1.lastIndexOf("DMC"));
		System.out.println("index of DMC = "+l1.indexOf("abcd"));
		System.out.println("last index of DMC = "+l1.lastIndexOf("abcd"));

	}
}





/*
// addAll() , contains(), getFirst(), getLast(), indexOf()

public class Day12_4 {

	public static void main(String[] args)
	{
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("DMC");
		l1.add("DAC");
		l1.add("DITISS");
		l1.add("DBDA");
		l1.add("DESD");
		ArrayList<String> a1= new ArrayList<String>();
		a1.addAll(l1);
		System.out.println("Linked List Element are  :"+l1);
		System.out.println("Array List Element are  :"+a1);
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.addAll(0, l1);
		System.out.println("Array List Element are A2  :"+a2);
		ArrayList<String> a3=  new ArrayList<String>();
		a3.add("Java");
		a3.add("Python");
		
		a2.addAll(2, a3);
		System.out.println("Array List Element are A2  :"+a2);
		
		System.out.println("Contains : "+l1.contains("DMC"));
		System.out.println("Contains : "+l1.contains("DMC1234"));
		System.out.println("First LL element = "+l1.getFirst());
		System.out.println("Last LL Element = "+l1.getLast());
		System.out.println("Index of  DMC = "+l1.indexOf("DMC"));
		

	}

}

*/
