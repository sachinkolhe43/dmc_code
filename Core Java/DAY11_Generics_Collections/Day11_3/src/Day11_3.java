//class Test is taking two generic type parameters 
class Test<T,U>
{
	T num1;
	U num2;
	
	
	Test(T num1,U num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	void disp()
	{
		System.out.println("Num1 = "+this.num1+" Num2 = "+this.num2);
	}
	
}

public class Day11_3 {

	public static void main(String[] args) 
	{
		Test t1=new Test(4,3.5); // RAW TYPE 
		// 4 ==> Integer ==> represented as Object
		// 3.5 ==> Double ==> represented as Object
		// sub class(Integer) object is store in super class (Object) reference
		// UPCASTING 
		
		Test<Integer,Float> t2=new Test<Integer,Float>(40,2.4f);
		Test<Integer,Integer> t3=new Test<Integer,Integer>(5,8);
		Test<Float,Integer> t4=new Test<Float,Integer>(5.3f,55);
		Test<Integer,String> t5=new Test<Integer,String>(99,"Pune");
		Test<String,String> t6=new Test<String,String>("Akshita","Sunbeam");
		t1.disp();
		t2.disp();
		t3.disp();
		t4.disp();
		t5.disp();
		t6.disp();
		//Test<Integer> t7=new Test<Integer>();  // javac error 
		// incorrect number of parameters of type Test 
		
	}

}
