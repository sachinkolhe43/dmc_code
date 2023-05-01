import java.util.ArrayList;

public class Day11_14 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50); 
		System.out.println("Al = "+al+" \t "+al.hashCode());
		ArrayList<Integer> a2 = al; //reference 
		System.out.println("A2 = "+a2+" \t "+a2.hashCode());
		al.add(60);
		System.out.println("A1 = "+al+" A2 = "+a2);
		
		ArrayList<Integer> a3 = (ArrayList<Integer>) al.clone(); 
		System.out.println("A1 = "+al+" A3 = "+a3);
		al.add(65);
		
		System.out.println("A1 = "+al+" A3 = "+a3);
		
		//Integer i = new Integer(60);
		//Integer i2 = i.clone(); //javac error 
		
		
		

	}

}
