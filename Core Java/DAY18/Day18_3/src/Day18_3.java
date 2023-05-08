// creating a thread using extends keyword
// Two classes extends Thread
// supply some name to thread


class EvenNumbers extends Thread
{
	String name;
	EvenNumbers()
	{}
	EvenNumbers(String name)
	{
		super(name); // this will call super class constructor
		// Thread(String name)
	}
	@Override
	public void run()
	{
		for(int i=0;i<=10;i+=2)
		{
			System.out.println(i+ " " +this);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class OddNumbers extends Thread
{
	String name;
	OddNumbers()
	{}
	OddNumbers(String name)
	{
		super(name);
	}
	@Override
	public void run()
	{
		for(int i=1;i<=10;i+=2)
		{
			System.out.println(i+ " " +this);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Day18_3 
{

	public static void main(String[] args) throws Exception
	{
		EvenNumbers eobj = new EvenNumbers("EVEN"); //eobj is thread object
		OddNumbers oobj= new OddNumbers("ODD"); // oobj is thread object
		eobj.start();
		// start() is from Thread class
		// non static method
		oobj.start();
		
	}

}
