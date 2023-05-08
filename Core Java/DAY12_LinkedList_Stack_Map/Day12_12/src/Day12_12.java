import java.util.ArrayDeque;
import java.util.NoSuchElementException;

// since its Double Ended Queue
// public boolean offerFirst(E e)
//public boolean offerLast(E e)
//public E removeFirst()
//public E removeLast()


public class Day12_12 {

	public static void main(String[] args) 
	{
		try
		{
		ArrayDeque<Integer> a1=new ArrayDeque<Integer>();
		a1.offer(115);
		a1.offer(210);
		a1.offer(225);
		a1.offer(320);
		System.out.println("A1 = "+a1);
		a1.offerFirst(10);
		a1.offerLast(100);
		System.out.println("A1 = "+a1);
		a1.removeFirst();
		a1.removeLast();
		System.out.println("A1 = "+a1);
		a1.remove();
		a1.remove();
		a1.remove();
		a1.remove();
		System.out.println("A1 = "+a1);
		a1.remove();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Queue is Empty !! ");
		}
		
		
	}
}




/*

//ArrayDeque offer(), poll() , peek()
public class Day12_12 {

	public static void main(String[] args) 
	{
		ArrayDeque<Integer> a1=new ArrayDeque<Integer>();
		a1.offer(115);
		a1.offer(210);
		a1.offer(225);
		a1.offer(320);
		System.out.println("A1 = "+a1);
		System.out.println("Element = "+a1.peek());
		a1.poll();
		System.out.println("A1 = "+a1);
		a1.poll();
		a1.poll();
		a1.poll();
		System.out.println("A1 = "+a1);
		//System.out.println("Element = "+a1.peek()); // null
		System.out.println(a1.poll());  // null
	}

}

*/



/*
//ArrayDeque  // add() , remove() , element()

public class Day12_12 {

	public static void main(String[] args) 
	{
		ArrayDeque<Integer> a1=new ArrayDeque<Integer>();
		a1.add(15);
		a1.add(20);
		a1.add(25);
		a1.add(30);
		System.out.println("A1 = "+a1);
		System.out.println("Element = "+a1.element());
		a1.remove();
		System.out.println("A1 = "+a1);
		a1.remove();
		a1.remove();
		a1.remove();
		System.out.println("A1 = "+a1);
		//System.out.println("Element = "+a1.element()); //NoSuchElementException
		a1.remove(); //NoSuchElementException
	}

}

*/
