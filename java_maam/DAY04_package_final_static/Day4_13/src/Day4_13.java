
class MathDemo
{
	static int num1;
	static int num2;
	
	static
	{
		num1=5;
		num2=5;
	}
	//non static method can access static and non static fields 
	
	void disp() // non static 
	{
		System.out.println("Num1 = "+num1+" Num2 ="+num2);
	}
	// static method can access only static fields 
	
	static void add() // static method 
	{
		System.out.println("Addition = "+(num1+num2));
	}
	
	
}


public class Day4_13 
{

	public static void main(String[] args)
	{
		MathDemo m=new MathDemo();
		m.disp(); //non static disp() is called upon m object
		MathDemo.add(); // add() static method is called with the help of classname
		// Static methods are designed to be called upon Classname 
		

	}

}



/*
class MathDemo
{
	int num1;
	int num2;
	MathDemo()
	{
		this.num1=5;
		this.num2=5;
	}
	
	void disp() // non static 
	{
		System.out.println("Num1 = "+num1+" Num2 ="+this.num2);
	}
	
	void add() //non static 
	{
		System.out.println("Addition = "+(num1+num2));
	}
	
	
}


public class Day4_13 
{

	public static void main(String[] args)
	{
		MathDemo m=new MathDemo();
		m.disp(); //disp() is called upon m object
		m.add(); //add() is called upon m object 
		

	}

}
*/