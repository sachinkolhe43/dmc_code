// Garbage Collection
// JVM Performs Garbage Collection Periodically
// before the garbage collection takes place it gives a call 
// to one method finalize() method



class Test
{
	Test()
	{
		System.out.println("Test class Parameterless Constructor");
	}
	
	void print()
	{
		System.out.println("Inside print method of Test Class");
	}
	
	@Override
	public void finalize()
	{
		System.out.println("Inside Finalize Method");
		Thread th=Thread.currentThread();
		System.out.println("Name ="+th.getName());
		System.out.println("State = "+th.getState().name());
		System.out.println("Group = "+th.getThreadGroup());
		System.out.println("Is Deamon = "+th.isDaemon());
		System.out.println("Is Alive = "+th.isAlive());
		
	}
	
	
}
public class Day18_7 {

	public static void main(String[] args)
	{
		Test tobj = new Test();
		tobj.print();
		tobj=null;
		System.gc();
		// request is made to jvm for performing garbage collection

	}

}
