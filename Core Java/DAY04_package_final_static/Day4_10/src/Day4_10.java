// static
// static field 
//static fields must be initialized only once during the life cycle of the program
// static fields must be initialized using static initialization block
//static initialization block gets called at the time of class loading
//static fields persist its state for all the objects in a program


class Test
{
	int num1; // non static field 
	int num2; // non static field
	static int s_var; //static filed
	
	static
	{
		System.out.println("Inside static initialization block");
		s_var=55;
	}
	
	Test()
	{
		System.out.println("Inside Parameterless constructor");
		this.num1=20;
		this.num2=20;
		
	}
	
	void disp()
	{
		System.out.println("Num1 "+this.num1+" Num2 "+this.num2+" S Var = "+s_var);

	}
	
	
	void update()
	{
		s_var = s_var+50;
	}
	
}



public class Day4_10 
{

	public static void main(String[] args)
	{
		Test t1=new Test();
		Test t2=new Test();
		t1.disp();
		t2.disp();
		t1.update();
		t1.disp();
		t2.disp();
		

	}

}
