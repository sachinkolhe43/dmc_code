package p1;

public interface Printer
{
	//data member of interface
	// javac implicitely adds // public static final keyword 
	// public static final int DATA = 1234 ;
	int DATA = 1234;
	
	
	// for the methods inside the interface: javac implicitly adds public abstract
	
	// method declaration
	void print(String msg);
	// public abstract void print(String msg);
}
