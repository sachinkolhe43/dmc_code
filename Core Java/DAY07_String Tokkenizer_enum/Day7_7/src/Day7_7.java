
enum Day
{
	
	SUN(10,"Sunday"),MON(20,"Monday"),TUES(30,"Tuesday");
	
	private int dayNumber;
	private String dayName;
	Day(int dayNumber,String dayName)
	{		
		this.dayNumber=dayNumber;
		this.dayName=dayName;
	}
	public int getDayNumber() {
		return dayNumber;
	}
	public String getDayName() {
		return dayName;
	}
	
	
	
}



public class Day7_7 {

	public static void main(String[] args)
	{
		Day dobj = Day.TUES;
		System.out.println("Dobj "+dobj);
		System.out.println("Dobj name = "+dobj.name());
		System.out.println("dobj toString = "+dobj.toString());
		System.out.println("Dobj ordinal = "+dobj.ordinal());
		System.out.println("Dobj get day number = "+dobj.getDayNumber());
		System.out.println("Dobj get day name = "+dobj.getDayName());
		

	}

}
