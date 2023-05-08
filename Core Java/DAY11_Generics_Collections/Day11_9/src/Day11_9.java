// create an AL
// Integer type, Float type , String type\
// accept the data through functions 
// generateIntAL(AL<Integer> )
// generateFloatAL(AL(Float>)
// generateStringAL(AL <String>)
//displayIntAL(AL<Integer>)
//displayFloatAL(AL<Float>)
//displayStringAL(AL<String>)

import java.util.ArrayList;

public class Day11_9 
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
	
	
	private static void displayIntAL(ArrayList<Integer> list) 
	{
		System.out.println("Elements are :" +list);
		//for(Integer i :list)
			//System.out.print(i);
		
	}
	
	private static void displayFloatAL(ArrayList<Float> list) 
	{
		System.out.println("Elements are :" +list);
		
	}
	
	private static void displayStringAL(ArrayList<String> list) 
	{
		System.out.println("Elements are :" +list);
		
	}
	
	
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		ArrayList<Float> a2=new ArrayList<Float>();
		ArrayList<String> a3=new ArrayList<String>();
		
		generateIntAL(a1);
		generateFloatAL(a2);
		generateStringAL(a3);
		
		
		displayIntAL(a1);
		displayFloatAL(a2);
		displayStringAL(a3);
		
		
		
		

	}

	

}
