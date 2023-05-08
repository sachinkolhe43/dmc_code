package p1;



public class Day8_9 {

	public static void main(String[] args)
	{
		BoundedShape bs[] = {new Circle(5,8,7),new Rectangle(15,25,8,8)};
		//bs is an array of references
		// Dynamic Method Dispatch
		// b = bs[0] 
		// b = bs[1] 
		for(BoundedShape b : bs)
			System.out.println(b.area());
		
	}
}


/*
public class Day8_9 {

	public static void main(String[] args)
	{
		Circle cobj = new Circle(5,5,6);
		Rectangle robj = new Rectangle(5,5,8,9);
		System.out.println(cobj.area());
		System.out.println(robj.area());

	}

}
*/
