//ThreadGroup example
public class Day18_6 {

	public static void main(String[] args) 
	{
		ThreadGroup tg1=new ThreadGroup("tg1");

		Thread th1=new Thread(tg1,"First");
		Thread th2=new Thread(tg1,"Second");
		System.out.println("Th1 = "+th1);
		System.out.println("Th2 = "+th2);
		ThreadGroup tg2=new ThreadGroup("tg2");
		Thread th3=new Thread(tg2,"Third");
		Thread th4=new Thread(tg2,"Fourth");
		Thread th5=new Thread();
		System.out.println("Th3 = "+th3);
		System.out.println("Th4 = "+th4);
		System.out.println("Th5 = "+th5);
		
		
	}
	
}


/*
public class Day18_6 {

	public static void main(String[] args) 
	{
		Thread th1=new Thread("First");
		Thread th2=new Thread("Second");
		Thread th3=new Thread("Third");
		Thread th4=new Thread("Fourth");
		System.out.println("Th1 = "+th1);
		System.out.println("Th2 = "+th2);
		System.out.println("Th3 = "+th3);
		System.out.println("Th4 = "+th4);
		
		
	}

}

*/
