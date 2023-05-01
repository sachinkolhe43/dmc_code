import java.util.Scanner;
import java.util.stream.IntStream;

// IntStream example
// start index = 1
// stop index = 25
// stream of numbers from start to end
// find even numbers
// average of numbers else print 0


public class Day17_5 {

	public static void main(String[] args) 
	{
		int strt;
		int end;
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter Start number");
		strt = sc.nextInt();
	
		System.out.println("Enter end number");
		end = sc.nextInt();
		
		double avg = IntStream.rangeClosed(strt,end)
				 .filter(i -> i%2 == 0)
				 .average().orElse(0);
		System.out.println("Average = "+avg);
	}

}
