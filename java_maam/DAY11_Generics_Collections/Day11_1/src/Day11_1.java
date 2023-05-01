// Test is a class , who can take generic type parameter
// parameterized constructor (method of the class)
// method is also taking one generic type parameter
class Test<T>
{
	T var;
	Test()
	{
		
	}
	Test(T var) // constructor is taking generic type parameter
	{
		this.var=var;
	}
	void disp()
	{
		System.out.println("T = "+var);
	}
	
}
public class Day11_1 {

	public static void main(String[] args) 
	{
		
		Test t1=new Test(); // RAW TYPE
		t1.disp();
		Test<Integer> t2=new Test<Integer>(45);
		t2.disp();
		Test<Double> t3=new Test<Double>(8.5);
		t3.disp();
		Test<String> t4=new Test<String>("sunbeam");
		t4.disp();
		Test<Float> t5=new Test<Float>(5.3f);
		t5.disp();
		
		
		//Test<Integer> t6 = new Test<Integer>(6.5); // javac error 
		
			
		Double d = new Double(7.8);
		Test<Double> t6 = new Test<Double>(d);
	}
}




/*
 class Test
 
{
	int num;
	double var;
	Test()
	{
		this.num=25;
	}
	Test(int num)
	{
		this.num=num;
	}
	Test(double var)
	{
		this.var=var;
	}
	
	int getNum()
	{
		return this.num;
	}
	void disp()
	{
		System.out.println("Num = "+this.num);
	}
	
}
public class Day11_1 {

	public static void main(String[] args) 
	{
		Test tobj=new Test();
		tobj.disp();
		Test tobj1=new Test(45);
		tobj1.disp();
		System.out.println(tobj.getNum());
		Test t2 = new Test(9.5);
		
		
		
	}

}
*/