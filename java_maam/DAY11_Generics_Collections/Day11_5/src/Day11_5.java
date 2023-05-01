//condition
// type parameter must be only numeric value
// type parameter must only extends from Number class
// Bounded Type Condition in case of generic

class Box<T extends Number>  
{
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}


public class Day11_5 {

	public static void main(String[] args) 
	{
		Box<Integer> b1= new Box<Integer>();
		b1.setValue(40);
		
		//Box<Boolean> b2= new Box<Boolean>(); //BOUND MISMATCH 
		//b2.setValue(true);
		
		Box<Double> b3= new Box<Double>();
		b3.setValue(7.9);
		
		Box<Float> b4= new Box<Float>();
		b4.setValue(9.5f);
		
		//Box<String> b5= new Box<String>(); //BOUND MISMATCH
		//because String does not extends from Number class 
		// b5.setValue("Sunbeam");
		
		System.out.println(b1.getValue());
		//System.out.println(b2.getValue());
		System.out.println(b3.getValue());
		System.out.println(b4.getValue());
		//System.out.println(b5.getValue());
	}

}


/*
class Box<T> // T type parameters always will have Object as a super most class
{
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}


public class Day11_5 {

	public static void main(String[] args) 
	{
		Box<Integer> b1= new Box<Integer>();
		b1.setValue(4);
		
		Box<Boolean> b2= new Box<Boolean>();
		b2.setValue(true);
		
		Box<Double> b3= new Box<Double>();
		b3.setValue(9.9);
		
		Box<Float> b4= new Box<Float>();
		b4.setValue(2.5f);
		
		Box<String> b5= new Box<String>();
		b5.setValue("Sunbeam");
		
		System.out.println(b1.getValue());
		System.out.println(b2.getValue());
		System.out.println(b3.getValue());
		System.out.println(b4.getValue());
		System.out.println(b5.getValue());
	}

}


*/