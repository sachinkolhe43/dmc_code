//append() method 
public class Day7_1 {

	public static void main(String[] args)
	{
		StringBuffer sb1=new StringBuffer("Sunbeam");
		System.out.println("Sb1 = "+sb1);
		sb1.append("Pune");
		System.out.println("Sb1 = "+sb1);
		sb1.append(12345);
		System.out.println("Sb1 = "+sb1);
		sb1.append(" PGDMC").append(" PG-DAC").append(" PG-DBDA");
		System.out.println("Sb1 = "+sb1);
		
		
	}

}
