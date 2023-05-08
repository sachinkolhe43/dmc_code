//Method Reference to constructor
// if we wish to refere to constructor using method reference
//then the functional interface method must have a return type as classname
// also , while storing the reference we should use new keyword

@FunctionalInterface
interface MyInterface
{
	Demo display(String str);
}

class Demo
{
	public Demo(String str)
	{
		System.out.println(str);
	}
}

public class Day16_4 {

	public static void main(String[] args)
	{
		MyInterface ref = Demo::new;
		ref.display("Sunbeam");
		
	}

}
