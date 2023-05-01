// creating a thread using extends keyword
// Two classes extends Thread
// by default name given to thread is Thread-0 , Thread-1 , Thread-2 .....


class EvenNumbers extends Thread
{
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

public class Day18_2 
{

	public static void main(String[] args) throws Exception
	{
		EvenNumbers eobj = new EvenNumbers(); //eobj is thread object
		OddNumbers oobj= new OddNumbers(); // oobj is thread object
		//eobj.run(); // Not Recommended 
		//oobj.run();// Not Recommended 
		eobj.start();
		oobj.start();
		EvenNumbers eobj1 = new EvenNumbers(); //eobj is thread object
		OddNumbers oobj1= new OddNumbers(); // oobj is thread object
		eobj1.start();
		oobj1.start();
	}

}
