//String predefined methods 

//compareTo() ==> Compares two strings lexicographically.
// based on ASCII Values 


public class Day6_7 {

	public static void main(String[] args) 
	{
		String s1 = "SunbeamPune";
		System.out.println(s1.indexOf('n')); 
		//Returns the index within this string of 
		//the first occurrence of the specified character.
		
		System.out.println(s1.indexOf('n',5)); //it will search after 5th location
		
		System.out.println("Length = "+s1.length());
		System.out.println(s1.replace('P', 'p'));
		System.out.println(s1.startsWith("Sun"));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,7));
		
	}
}



/*
public class Day6_7 {

	public static void main(String[] args) 
	{
		String s1 = "Sunbeam";
		System.out.println(s1.contains("Sun"));
		System.out.println(s1.contains("abc"));
		System.out.println(s1.endsWith("beam"));
		

	}
}

*/




/*
public class Day6_7 {

	public static void main(String[] args) 
	{
		String s1 = "Sunbeam";
		String s2 = "Sunbeam";
		String s3 = "sunbeam";
		System.out.println("character at location 1 = "+s1.charAt(1));
		System.out.println("Compare to = "+s1.compareTo(s2)); //0 
		System.out.println("Compare to = "+s1.compareTo(s3)); // -32 
		//S = 83 s =115 
		// 83 - 115 = -32 
		
		System.out.println("Compare to = "+s3.compareTo(s1)); // 32
		// 115 - 83  = 32 

		System.out.println("Ignore case = "+s1.compareToIgnoreCase(s3));
		System.out.println("Ignore Case = "+s3.compareToIgnoreCase(s1));
		
	}

}

*/
