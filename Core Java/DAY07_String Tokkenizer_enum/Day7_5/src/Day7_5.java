import java.util.StringTokenizer;


public class Day7_5 {

	public static void main(String[] args) 
	{
		String str="https://sunbeaminfo.com/post-graduate-diploma-programmes/pg-diploma-in-mobile-computing\n"
				+ "";	
		String delim =":/-.";
		StringTokenizer stk=new StringTokenizer(str,delim,true);
		String tk = null;
		while(stk.hasMoreTokens())
		{
			tk = stk.nextToken();
			System.out.println("Token = "+tk);
		}
		
	}
}



/*
public class Day7_5 {

	public static void main(String[] args) 
	{
		String str="https://sunbeaminfo.com/post-graduate-diploma-programmes/pg-diploma-in-mobile-computing\n"
				+ "";	
		String delim =":/-.";
		StringTokenizer stk=new StringTokenizer(str,delim);
		String tk = null;
		while(stk.hasMoreTokens())
		{
			tk = stk.nextToken();
			System.out.println("Token = "+tk);
		}
		
	}
}

*/	
	
	
	
/*
public class Day7_5 {

	public static void main(String[] args) 
	{
		String str="www.sunbeaminfo.com/placements";	
		String delim ="./";
		StringTokenizer stk=new StringTokenizer(str,delim);
		String tk = null;
		while(stk.hasMoreTokens())
		{
			tk = stk.nextToken();
			System.out.println("Token = "+tk);
		}
		
	}
}

*/


/*
public class Day7_5 {

	public static void main(String[] args) 
	{
		String str="Sunbeam Infotech Pune Hinjewadi";	
		StringTokenizer stk=new StringTokenizer(str);
		String token = null;
		while(stk.hasMoreTokens())
		{
			token = stk.nextToken();
			System.out.println("Token = "+token);
		}
		
	}
}
*/

/*
public class Day7_5 {

	public static void main(String[] args) 
	{
		String str="Sunbeam Infotech Pune Hinjewadi";
		StringTokenizer stk = new StringTokenizer(str);
		System.out.println(stk.countTokens());
	}

}
*/