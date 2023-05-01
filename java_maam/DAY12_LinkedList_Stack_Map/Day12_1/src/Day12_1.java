import java.util.ArrayList;

public class Day12_1 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		
		a2.addAll(al);
		//public boolean addAll(Collection<? extends E> c)
		System.out.println(al);
		System.out.println(a2);
		

	}

}








