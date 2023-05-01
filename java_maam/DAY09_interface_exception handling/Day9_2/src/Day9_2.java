
class Machine
{
	public void start()
	{
		System.out.println("Inside Machine Start Method");
	}
}

class Laptop extends Machine
{
	public void start() //overridden method 
	{
		System.out.println("Inside Laptop Start Method");
	}
	
	public void stop()  //non overridden method
	{
		System.out.println("Inside Laptop Stop Method");
	}
}


class Mobile extends Machine
{
	public void start() //overridden method 
	{
		
		System.out.println("Inside Mobile Start Method");
	}
	
	public void stop()  //non overridden method
	{
		System.out.println("Inside Mobile Stop Method");
	}
}

public class Day9_2
{
	public static void main(String[] args) 
	{
		Machine mobj = new Machine();
		//mobj.start(); // Machine class start() will be called 
		
		
		Laptop lobj = new Laptop();
		//lobj.start(); // calls start() from Laptop class
		//lobj.stop(); // calls stop() from Laptop class
		
		
		//UPCASTING
		//When the reference variable of super class 
		//refers to the object of subclass
		
		Machine m2 = lobj; // Machine m2 = new Laptop(); 
		m2.start(); // calls start() from Laptop class
		//m2.stop(); // not allowed 
		//stop() is non overrridden method 
		
		//m2 = new Mobile(); // UPCASTING 
		//m2.start(); // calls start() from Mobile class
		
		Machine m3 = new Laptop(); // upcasting
		m3.start(); // start() will be called from Laptop class
		
		//Downcasting 
		//Assigning parent class reference (which is pointing to child class object)
		// to child class reference .
		
		// DOWNCASTING
		Laptop l1 = (Laptop)m3;  
		l1.start(); // start() will be called from Laptop class
		l1.stop(); // stop() will be called from Laptop class
		
		Mobile mb = (Mobile)m3; // ClassCastException
		// m3 is currently pointing to Laptop object
		// m3 is not pointing to Mobile Object , so its ClassCastException
		//Thrown to indicate that the code has attempted to cast an object 
		//to a subclass of which it is not an instance.
		
		
		
		
		
		
		
	}

}
