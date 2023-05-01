import java.util.Arrays;
import java.util.stream.IntStream;

//int[]  ==> convert into intStream

public class Day17_3 {

	public static void main(String[] args) 
	{
		int[] data = {12,10,3,4,26,5,7,9};
		IntStream stm = Arrays.stream(data);
		System.out.println(data);
		System.out.println(stm);
		//System.out.println(stm.count());
		//System.out.println(stm.max());
		//System.out.println(stm.min());
		System.out.println(stm.average());
		
	}

}
