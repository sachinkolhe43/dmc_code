// UNBOUNDED wild card <?>

import java.util.ArrayList;

public class Day11_10 
{
	public static void generateIntAL(ArrayList<Integer> list)
	{
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
	}
	
	public static void generateFloatAL(ArrayList<Float> list)
	{
		list.add(10.5f);
		list.add(20.3f);
		list.add(30.8f);
		list.add(40.6f);
		
	}
	
	public static void generateStringAL(ArrayList<String> list)
	{
		list.add("DMC");
		list.add("DAC");
		list.add("DBDA");
		list.add("DITISS");
		
	}
	
	
	private static void displayAL(ArrayList<?> list) //wild card UNBOUNDED
	{
		System.out.println("Elements are :" +list+"\t"+list.getClass());
				
	}
	
		
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		ArrayList<Float> a2=new ArrayList<Float>();
		ArrayList<String> a3=new ArrayList<String>();
		
		generateIntAL(a1);
		generateFloatAL(a2);
		generateStringAL(a3);
		
		
		displayAL(a1);
		displayAL(a2);
		displayAL(a3);
		
		
		
		
		

	}

	

}
