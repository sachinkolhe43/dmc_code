import java.util.Arrays;
import java.util.Scanner;

enum Color
{
	RED,GREEN,BLUE;
}

//Requirement
// give options to user  enter color name "RED / GREEN / BLUE
// take input from user 
// if user enters red, Red , ReD  ==> convert it into capital ==> RED
// print its name and ordinal value
// valueOf()

public class Day6_7 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Color name : RED/ GREEN/ BLUE");
		String str = sc.nextLine();
		
		Color c = Color.valueOf(str.toUpperCase());
		System.out.println("Name = "+c.name());
		System.out.println("Ordinal = "+c.ordinal());
	}
}








/*
  // values() method from enum class
  
public class Day6_7 {

	public static void main(String[] args) 
	{
		Color[] clr =Color.values();
		for(Color c : clr)
			System.out.println(c+"\t"+c.toString() +"\t"+c.name()+"\t"+c.ordinal());
		
		//System.out.println(Arrays.toString(clr));
		
		//for(int i=0;i<clr.length;i++)
			//System.out.println(clr[i]);
		
	}
}

*/
/*

// difference between toString() and ordinal in case of enum
 
public class Day6_7 {

	public static void main(String[] args) 
	{
		System.out.println(Color.RED +" "+ Color.RED.toString() + " "+ Color.RED.ordinal());
		System.out.println(Color.GREEN +" "+ Color.GREEN.toString() + " "+ Color.GREEN.ordinal());
		System.out.println(Color.BLUE + " " +Color.BLUE.toString() + " "+Color.BLUE.ordinal());
	}

}
*/