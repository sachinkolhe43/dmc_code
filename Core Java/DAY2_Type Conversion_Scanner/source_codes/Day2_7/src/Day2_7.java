// Narrowing
// In case of narrowing it is compulsory to specify the data type at the time of conversion

public class Day2_7 {

	public static void main(String[] args) 
	{
		double dval =12.56;
		float num = (float)dval; //Narrowing 
		System.out.println("Double value = "+dval);
		System.out.println("Number = "+num);

	}

}

/*
public class Day2_7 {

	public static void main(String[] args) 
	{
		double dval =8.56;
		int num = (int)dval; //Narrowing 
		System.out.println("Double value = "+dval);
		System.out.println("Number = "+num);

	}

}
*/