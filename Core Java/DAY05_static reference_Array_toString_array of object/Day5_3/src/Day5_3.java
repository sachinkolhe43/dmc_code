import java.time.LocalDate;

public class Day5_3 {

	public static void main(String[] args) 
	{
		LocalDate ldt = LocalDate.now();
		//now() is having return type as LocalDate 
		//we resultant data we are storing into reference of type LocalDate
		System.out.println("LDT = "+ldt);
		//ldt.toString() will be called from LocalDate class 
		
		int day = ldt.getDayOfMonth();
		int month = ldt.getMonthValue();
		int year = ldt.getYear();
		System.out.println("Day = "+day+" Month = "+month+" Year = "+year);

	}

}
