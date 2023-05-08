// creating a thread using implements Runnable


class EvenNumbers implements Runnable
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

class OddNumbers implements Runnable
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

public class Day18_4 
{

	public static void main(String[] args) throws Exception
	{
		EvenNumbers eobj = new EvenNumbers(); // Runnable Object
		OddNumbers oobj = new OddNumbers(); // Runnable Object
		//represent Runnable object in Thread object
		
		Thread th1=new Thread(eobj);
		//a constructor will be called from Thread class
		// public Thread(Runnable target)
		th1.start();
		
		Thread th2=new Thread(oobj);
		
		th2.start();
		
	}

}
