// fetching the information about the thread
public class Day17_9 {

	public static void main(String[] args) 
	{
		Thread th = Thread.currentThread();
		System.out.println("Th = "+th);
		System.out.println("Name = "+th.getName());
		System.out.println("Priority = "+th.getPriority());
		System.out.println("Group = "+th.getThreadGroup());
		System.out.println("State = "+th.getState().name());
		System.out.println("Is Alive = "+th.isAlive());
		System.out.println("Deamon = "+th.isDaemon());
	}
}




// currentThread()

/*
public class Day17_9 {

	public static void main(String[] args) 
	{
		Thread th = Thread.currentThread();
		System.out.println("Current Thread = "+th);
		//Returns a string representation of this thread, 
		//including the thread's name, priority, and thread group.
	}

}
*/