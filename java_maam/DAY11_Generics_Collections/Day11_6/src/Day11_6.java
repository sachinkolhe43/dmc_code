import java.util.ArrayList;



public class Day11_6 {

	public static void main(String[] args) 
	{
		
		ArrayList al=new ArrayList();
		al.add(25);
		al.add("test");
		al.add(4.2f);
		
		Integer s1 = (Integer) al.get(0);
		String s2= (String)al.get(1);
		float fval = (Float)al.get(2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(fval);
		System.out.println(al.get(4));
		
		
		
	}
}


/*
//creating an ArrayList 
public class Day11_6 {

	public static void main(String[] args) 
	{
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(5);
		al.add(6);
		//al.add(9.2); // not allowed // javac error
		System.out.println(al); // al.toString()
	}
}
*/


/*
public class Day11_6 {

	public static void main(String[] args) 
	{
		
		ArrayList al=new ArrayList(); //RAW TYPE // Not Recommended
		al.add(25); //25 ==> Object
		al.add(5.5);
		al.add("sunbeam");
		al.add(true);
		System.out.println(al);
		
		
	}

}
*/