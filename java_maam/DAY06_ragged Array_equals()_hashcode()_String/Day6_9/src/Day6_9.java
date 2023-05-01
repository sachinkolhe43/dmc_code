// PRACTICE IN LAB 
//char	charAt(int index)
// StringBuffer	delete(int start, int end)
//StringBuffer	deleteCharAt(int index)
//int	indexOf(String str)
//int	indexOf(String str, int fromIndex)
//StringBuffer	insert(int offset, String str) //offset is location
//int	length()
//StringBuffer	reverse()



public class Day6_9 {

	public static void main(String[] args)
	{
		StringBuffer sb1=new StringBuffer("Sunbeam");
		StringBuffer sb2=new StringBuffer(" PG-DMC");
		System.out.println(sb1.append(sb2));
		System.out.println(sb1.reverse());
	}
}


/*
//StringBuilder Mutable 
public class Day6_9 {

	public static void main(String[] args)
	{
		StringBuilder sb1=new StringBuilder("Sunbeam");
		System.out.println(sb1);
		System.out.println(sb1.append(" Pune"));
		System.out.println(sb1);
		
	}

}
*/



/*
//StringBuffer Mutable 
public class Day6_9 {

	public static void main(String[] args)
	{
		StringBuffer sb1=new StringBuffer("Sunbeam");
		System.out.println(sb1);
		System.out.println(sb1.append(" Pune"));
		System.out.println(sb1);
		
	}

}

*/
