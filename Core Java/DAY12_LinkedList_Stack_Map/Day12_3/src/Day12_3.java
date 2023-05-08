import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class Day12_3 {

	public static void main(String[] args) 
	{
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("DMC");
		l1.add("DAC");
		l1.add("DITISS");
		l1.add("DBDA");
		l1.add("DESD");
		
		//for(String str : l1)
			//System.out.print(str+"\t");
		
		//System.out.println();
		//for(int i=0;i<l1.size();i++)
			//System.out.print(l1.get(i)+"\t");
		
		//Iterator<E> iterator()
		Iterator<String> itr = l1.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+"\t");
		
		//public ListIterator<E> listIterator(int index)
		System.out.println();
		ListIterator<String> ltr = l1.listIterator(2); // it will traverse from 2nd location
		while(ltr.hasNext()) // FORWARD DIRECTION
			System.out.print(ltr.next()+"\t");
		
		System.out.println();
		ltr = l1.listIterator(3); // it will traverse from 3rd location
		while(ltr.hasPrevious()) // REVERSE DIRECTION 
			System.out.print(ltr.previous()+"\t");
		
		
		
		
		
		

	}

}
