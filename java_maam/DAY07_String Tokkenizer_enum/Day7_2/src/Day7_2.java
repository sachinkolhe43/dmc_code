//String Builder

public class Day7_2 {

	public static void main(String[] args) 
	{
		StringBuilder sb1=new StringBuilder(25);
		System.out.println("Length = "+sb1.length());
		System.out.println("Capacity = "+sb1.capacity());
		
		
		StringBuilder sb2=new StringBuilder("SunbeamPune");
		
		System.out.println("Length = "+sb2.length());
		System.out.println("Capacity = "+sb2.capacity());
	}
}


/*
public class Day7_2 {

	public static void main(String[] args) 
	{
		StringBuilder sb1=new StringBuilder(""); //default constructor 
		System.out.println("Length = "+sb1.length());
		System.out.println("Capacity = "+sb1.capacity());
		System.out.println(sb1);
		sb1.insert(0, "Akshita");
		System.out.println(sb1);
		sb1.append("-Trainer Core Java PG DMC ");
		System.out.println(sb1);
		System.out.println("Length = "+sb1.length());
		System.out.println("Capacity = "+sb1.capacity());

	}

}

*/
