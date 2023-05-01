//static field 

class Customer
{
	String name;
	int acc_number;
	static int balance;
	
	static
	{
		balance = 5000;
	}
	
	Customer()
	{
		this.name="Akshita";
		this.acc_number=1234;
	
	}
	
	void print_details()
	{
		System.out.println("Name = "+this.name+" Number "+this.acc_number+" Balance "+balance);
	}
	
	void deposit()
	{
		balance = balance + 2000;
	}
	
	void withdraw()
	{
		balance = balance-1000;
	}
	
	
}
public class Day4_11 {

	public static void main(String[] args) 
	{
		Customer c1=new Customer();
		c1.print_details();
		c1.deposit();
		c1.deposit();
		c1.print_details();
		c1.withdraw();
		c1.print_details();
	}

}
