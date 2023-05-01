// class Count is extending Thread class
// Count is Threaded class

class Count extends Thread
{
	public void run()
	{
		
		for(int i=0;i<5;i++)
		{
			System.out.println(i+"\t"+this);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

public class Day17_11 {

	public static void main(String[] args) throws InterruptedException
	{
		Count cobj = new Count(); // cobj thread object
		cobj.start();
		Thread.sleep(500);
		Count cobj2 = new Count();// cobj2 thread object
		cobj2.start();

	}

}
