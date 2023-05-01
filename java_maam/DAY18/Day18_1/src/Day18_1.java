// creating a thread using extends keyword
// one class EvenNumebrs class extends Thread


class EvenNumbers extends Thread
{
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
public class Day18_1 
{

	public static void main(String[] args) throws Exception
	{
		EvenNumbers eobj = new EvenNumbers(); //eobj is thread object
		// because eobj belongs to EvenNumbers class which extends Thread
		eobj.start(); // Compulsory to start() a thread we call start() 
		// eobj.run(); // Not recommended 
		//start() will call run() 
		Thread.sleep(1500);
		EvenNumbers eobj2=new 	EvenNumbers();
		eobj2.start();
	
	}

}
