// Literal and Non Literal
// == VS equals()
// ==  is operator it checks reference equality
// equals() is method it checks contents inside String


public class Day6_8 {

	public static void main(String[] args) 
	{
		String s1 = "hello"; // s1 ===> Literal 
		String s2 = new String(s1); // s2 ===> non literal
		String s3 ="hello"; // s3 ===> literal
		String s4 = "Hello"; // s4 ===> literal
		System.out.println("S1 == S2 "+(s1==s2)); //False 
		System.out.println("s1 equals s2 "+s1.equals(s2)); // true
		// equals() checks the contents //it is called from String class 
		
		System.out.println("s1 == s3 "+(s1==s3)); //true 
		//s1 and s3 are literals and they are holding same data too
		System.out.println("s1 equals s3 "+s1.equals(s3)); //true
		
		System.out.println("s1 == s4 "+(s1==s4)); //false
		System.out.println("s1 equals s4 "+(s1.equals(s4))); //false
		System.out.println("s1 equals ignored s4 "+(s1.equalsIgnoreCase(s4))); // true 
		
		String s5 = s2.intern();
		System.out.println("s1 == s5 "+(s1==s5)); //true
		System.out.println("s2 == s5 "+(s2==s5)); //false // literal and non literal 
		System.out.println("s2 equals s5 "+s2.equals(s5)); // true
		
		
		
		
		

	}

}
