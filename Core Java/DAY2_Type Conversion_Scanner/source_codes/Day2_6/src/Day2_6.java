

//Widening
// In case of widening there is no need to mention the data type explicitily

public class Day2_6 {

	public static void main(String[] args) 
	{
		float fval = 6.8f;
		double dval = fval;
		System.out.println("Float value = "+fval);
		System.out.println("Double value = "+dval);
	}
}


/*
public class Day2_6 {

	public static void main(String[] args) 
	{
		int num=35;
		double d=(double)num; //explicit Widening
		//double d = num; // VALID  // implicit conversion
		System.out.println("Num = "+num);
		System.out.println("D = "+d);
		
		
	}

}
*/