package p1;

public class Day18_9 
{

	public static void main(String[] args) 
	{
		Account aobj = new Account(123,"Saving",45000.0);
		final double amount = 1000.0;
		
		Thread dt = new Thread(() -> {
			for(int i=0;i<4;i++)
			{
				aobj.deposit(amount);
				System.out.println("After Deposit = "+aobj.getBalance());
				Util.delay(1000);
			}
		} );
		dt.start();
		
		Thread wt = new Thread(() -> {
			for(int i=0;i<3;i++)
			{
				aobj.withdraw(amount);
				System.out.println("After withdraw = "+aobj.getBalance());
				Util.delay(1000);
			}
		} );
		wt.start();
		
		try
		{
			dt.join();
			wt.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Final Balance = "+aobj.getBalance());
		
		
		
		
		
		
	}

}
