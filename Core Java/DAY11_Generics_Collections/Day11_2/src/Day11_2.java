class Test<T> // class Test is taking generic type parameter
{
	private T value; // private field of generic type
	
	T getT() // method of the class is returning generic type parameter
	{
		return this.value;
	}
	
	void setT(T value) // method of the class is taking one argument of generic type 
	{
		this.value=value;
	}
	
}
public class Day11_2 
{

	public static void main(String[] args) {
		Test t1=new Test(); // RAW TYPE 
		Test<Integer> t2 = new Test<Integer>();
		t2.setT(55);
		System.out.println(t2.getT());
		Test<String> t3= new Test<String>();
		t3.setT("SUNBEAM");
		System.out.println(t3.getT());
		Test<Double> t4 = new Test<Double>();
		t4.setT(8.5);
		System.out.println(t4.getT());

	}

}
