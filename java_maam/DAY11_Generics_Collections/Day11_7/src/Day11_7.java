import java.util.ArrayList;
import java.util.Iterator;

// create an array list
// create an array (data array)
// populate arraylist from array
//display AL elements using various ways
// 1) toString 2) for loop 3) for each  4) iterator 



public class Day11_7 {

	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		int data[]= {12,15,13,10,5,8,9,20,21,25};
		
		//for(int i:data)
			//System.out.print(i+"\t");
		
		//for each element "i" inside data array
		// please add each element "i" inside the array list "al" 
		// by using add() 
		//populated the data from array to ArrayList 
		
		for(int i:data)
			al.add(i);
		System.out.println(al);
		
		//data is an array of int type ( primitive type) ==>P 
		// al is an ArrayList of AL type (non primitive) ==> NP
		// int to Integer ==> implicitly
		// AutoBoxing
		
		System.out.println("Displaying AL elements using toString");
		System.out.println(al); //similar to al.toString()
		
		System.out.println("Displaying AL using for loop");
		for(int i=0;i<al.size();i++)
			System.out.print(al.get(i)+"\t");
		
		System.out.println("\n Displaying AL using for each loop");
		//i = al[0]   i = al[1]  i = al[2] ..... i = al[size-1]
		for(Integer i : al)
			System.out.print(i+"\t");
		
		// Integer ===> NP Type 
		// element i ==> int ===> P type
		// NP to P conversion implicitly ==> AutoUnboxing 
		
		System.out.println("\n Displaying AL using iterator");
		// attach a iterator to the ArrayList
		// it will traverse in forward direction
		
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+"\t");
		
		//System.out.println(itr.next()); //java.util.NoSuchElementException
		
	}

}
