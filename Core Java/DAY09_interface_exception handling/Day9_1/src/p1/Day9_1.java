package p1;

import java.util.Scanner;

public class Day9_1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Num = "+num);
		sc.close(); // close() declared in AutoCloseable
	}
	
	}

/*

//dynamic method dispatch


public class Day9_1 {

	public static void main(String[] args) 
	{
		Printer p[] = {new NetworkPrinter(), new FilePrinter(), new ConsolePrinter()}; 
	
		//array of reference [of interface type]
		//p[0] ==> new NetworkPrinter()
		// p[1] ==> new FilePrinter()
		// p[2] ===>  new ConsolePrinter()
		
		p[0].print("Network printing job");
		System.out.println();
		p[1].print("Printing file job");
		System.out.println();
		p[2].print("Printing console job");
		
	}
}


*/

/*
public class Day9_1 {

	public static void main(String[] args) 
	{
		//NetworkPrinter np = new NetworkPrinter();
		//np.print("Print 5 pages ");
		
		//FilePrinter fp =new FilePrinter();
		//fp.print("printing files...");
		//fp.test();
		
		//ConsolePrinter cp= new ConsolePrinter();
		//cp.print("console print job done...");
		
		

	}

}
*/