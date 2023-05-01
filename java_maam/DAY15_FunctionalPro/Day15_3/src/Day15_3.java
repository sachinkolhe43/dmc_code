
@FunctionalInterface
interface Test
{
	void m1();
}
	
class Demo implements Test
{

	@Override
	public void m1() {
		System.out.println("Inside M1 method");
		
	}
	
}
public class Day15_3 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
