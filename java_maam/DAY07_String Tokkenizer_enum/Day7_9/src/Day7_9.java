// equals , == 
// overriding hashcode() and equals() 


public class Day7_9 {

	public static void main(String[] args)
	{
		String s1 = new String("Sunbeam");
		String s2=new String("Sunbeam");
		System.out.println(s1==s2); // false
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		String s3 =s1;
		System.out.println(s3==s1);
		System.out.println(s3.equals(s1));
	}

}
