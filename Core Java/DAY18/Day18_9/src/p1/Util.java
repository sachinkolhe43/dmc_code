package p1;

public class Util 
{
	public static void delay(int mili)
	{
		try 
		{
			Thread.sleep(mili);
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
	}
}
