// static fields must be used in static methods 
//can not make a static reference to non static field 


class Test
{
	private int num1;
	private int num2;
	private static int num3;
	
	public int getNum1() 
	{
		return num1;
	}
	public void setNum1(int num1) 
	{
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public static int getNum3() 
	{
		return num3;
	}
	public static void setNum3(int num3) 
	{
		//this.num1=num1; //javac error 
		//can not make a static reference to non static field 
		
		Test.num3 = num3;
	}
	
	
	
}


public class Day4_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
