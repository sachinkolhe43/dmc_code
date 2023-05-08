//Thread blocking calls / operations

//stop()
public class Day18_8 extends Thread
{
	String name;
	Day18_8(String name)
	{
		super(name);
	}
	public void run()
	{
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		for(int i =0;i<4;i++)
			System.out.println(Thread.currentThread().getName() +" "+i);
	}
	public static void main(String[] args) 
	{
		Day18_8 th1=new Day18_8("First");
		Day18_8 th2=new Day18_8("Second");
		Day18_8 th3=new Day18_8("Third");
		
		th1.start();
		th2.start();
		th1.stop();
		th3.start();
		th1.start(); //IllegalThreadStateException
		
		
	}

}





/*
//suspend() and resume() both works together

public class Day18_8 extends Thread
{
	String name;
	Day18_8(String name)
	{
		super(name);
	}
	public void run()
	{
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		for(int i =0;i<4;i++)
			System.out.println(Thread.currentThread().getName() +" "+i);
	}
	public static void main(String[] args) 
	{
		Day18_8 th1=new Day18_8("First");
		Day18_8 th2=new Day18_8("Second");
		
		
		th1.start();
		th2.start();
		th1.suspend();
		th1.resume();
		
		
	}

}
*/


/*
//yield()
public class Day18_8 extends Thread
{
	String name;
	Day18_8(String name)
	{
		super(name);
	}
	public void run()
	{
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		for(int i =0;i<4;i++)
			System.out.println(Thread.currentThread().getName() +" "+i);
	}
	public static void main(String[] args) 
	{
		Day18_8 th1=new Day18_8("First");
		Day18_8 th2=new Day18_8("Second");
		Day18_8 th3=new Day18_8("Third");
		
		th1.start();
		th2.start();
		
		th1.yield();
		th3.start();
		
		
	}

}
*/



/*
//join()
public class Day18_8 extends Thread
{
	String name;
	Day18_8(String name)
	{
		super(name);
	}
	public void run()
	{
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		for(int i =0;i<4;i++)
			System.out.println(Thread.currentThread().getName() +" "+i);
	}
	public static void main(String[] args) 
	{
		Day18_8 th1=new Day18_8("First");
		Day18_8 th2=new Day18_8("Second");
		Day18_8 th3=new Day18_8("Third");
		
		th1.start();
		try 
		{
			th1.join();
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
		th2.start();
		th3.start();
		
		
	}

}
*/
