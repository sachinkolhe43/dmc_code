// creating a thread using implements Runnable


class EvenNumbers implements Runnable
{
	String name;
	EvenNumbers(String name)
	{
		this.name=name;
	}
	
	@Override
	public void run()
	{
		for(int i=0;i<=10;i+=2)
		{
			System.out.println(i+ " " +this.name);
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
	String name;
	OddNumbers(String name)
	{
		this.name=name;
	}
	
	@Override
	public void run()
	{
		for(int i=1;i<=10;i+=2)
		{
			System.out.println(i+ " " +this.name);
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

public class Day18_5 
{

	public static void main(String[] args) throws Exception
	{
		EvenNumbers eobj = new EvenNumbers("EVEN"); // Runnable Object
		OddNumbers oobj = new OddNumbers("ODD"); // Runnable Object
		//represent Runnable object in Thread object
		
		
		Thread th1=new Thread(eobj,eobj.name); //th1 is Thread object 
		//a constructor will be called from Thread class
		// Thread(Runnable target, String name)
		System.out.println("Th1 = "+th1);
		th1.start();
		
		Thread th2=new Thread(oobj,oobj.name); //th2 is Thread object
		System.out.println("Th2 = "+th2);
		th2.start();
		
	}

}
