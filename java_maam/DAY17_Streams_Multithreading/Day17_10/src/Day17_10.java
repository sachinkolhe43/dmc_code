//Thread Priority


public class Day17_10 {

	public static void main(String[] args) 
	{
		Thread th = Thread.currentThread();
		System.out.println("Priority = "+th.getPriority());
		th.setPriority(3);
		System.out.println("Priority = "+th.getPriority());
	}
}


/*
public class Day17_10 {

	public static void main(String[] args) 
	{
		System.out.println("Max = "+Thread.MAX_PRIORITY);
		System.out.println("Min = "+Thread.MIN_PRIORITY);
		System.out.println("Normal = "+Thread.NORM_PRIORITY);

	}

}
*/