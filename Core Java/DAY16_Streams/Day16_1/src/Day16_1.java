
//Method reference to the instance of object

@FunctionalInterface
interface Calculate
{
	void execute();
}

@FunctionalInterface
interface MyInterface
{
	void test(int a,int b,int c);
}


public class Day16_1
{
	
	public void sum()
	{
		int num1=20;
		int num2=10;
		System.out.println("Addition = "+(num1+num2));
	}
	
	
	public void sub()
	{
		int num1=50;
		int num2=5;
		System.out.println("Subtraction = "+(num1-num2));
	}
	
	public void addition(int n1,int n2,int n3)
	{
		System.out.println("Addition = "+(n1+n2+n3));
	}
	
	public void multiplication(int n1,int n2,int n3)
	{
		System.out.println("Multiplication = "+(n1*n2*n3));
	}
	
	
	
	public static void main(String[] args) 
	{
		Day16_1 dobj = new Day16_1();
		
		Calculate calRef = dobj::sum;
		calRef.execute();
		
		calRef = dobj::sub;
		calRef.execute();
		
		MyInterface mref = dobj::addition; //this will refer to MyInterface test method
		//because addition() parameters and test() parameters are matching
		
		mref.test(20,20,15);
		
		mref = dobj::multiplication;
		mref.test(15, 3, 4);
		
		
		
		 
		
		
		
		
	}

}