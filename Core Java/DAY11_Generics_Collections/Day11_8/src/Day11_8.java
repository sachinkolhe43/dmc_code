import java.util.ArrayList;

//methods of ArrayList class

public class Day11_8 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		int data[]= {12,15,13,10,5,8,9,20,21,25};
		
		for(int i:data)
			al.add(i);
		System.out.println("AL = "+al);
		al.add(4, 44);
		System.out.println("AL = "+al);
		ArrayList<Integer> a2= new ArrayList<Integer>();
		a2.addAll(al); // used to add a complete collection inside another collection
		System.out.println("A2 ="+a2);
		a2.clear();
		System.out.println("A2 Clear = "+a2);
		System.out.println("AL is having element 25 = "+al.contains(25));
		System.out.println("AL is having element 85 = "+al.contains(85));
		System.out.println("Index of element 20 in AL = "+al.indexOf(20));
		System.out.println("Index of element 12 in AL = "+al.indexOf(12));
		System.out.println("Index of element 88 in AL = "+al.indexOf(88));
		System.out.println("AL is empty ? "+al.isEmpty());
		System.out.println("A2 is empty ? "+a2.isEmpty());
		System.out.println("Remove element at location 2 = "+al.remove(2));
		System.out.println(al);
	}

}
