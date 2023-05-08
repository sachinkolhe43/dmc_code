// split() from String class
//public String[] split(String regex)
// split() function returns string array 

// input : Sunbeam-infotech-pune
// output : Sunbeam    infotech    pune




/*
public class Day7_3 {

	public static void main(String[] args) 
	{
		String str = "Sunbeam-infotech-pune";
		String regex = "-";
		String sarr[] = str.split(regex);
		
		for(String s : sarr)
			System.out.println(s);
		
	}

}
*/



public class Day7_3 {

	public static void main(String[] args) 
	{
		String str = "www.sunbeaminfo.com hinjewadi";
		String splitchar = "\\.";
		String sarr[] = str.split(splitchar);
		
		for(String s : sarr)
			System.out.println(s);
		
	}

}

