import java.util.LinkedList;

public class Day12_2 {

	public static void main(String[] args)
	{
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(5);
		System.out.println("L1 = "+l1);
		l1.addFirst(2);
		System.out.println("Add First = "+l1);
		l1.addLast(50);
		System.out.println("Add Last = "+l1);
		l1.add(3,88);
		System.out.println("Add at position  =  "+l1);
		l1.removeFirst();
		System.out.println("L1 = "+l1);
		l1.removeLast();
		System.out.println("Remove Last L1 = "+l1);
		l1.remove(2);
		System.out.println("Remove element at position L1 = "+l1);
		
		
		
		

	}

}
