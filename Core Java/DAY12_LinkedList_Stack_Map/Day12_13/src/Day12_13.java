import java.util.PriorityQueue;

//PriorityQueue is unordered 
//(the way we enter the elements the sequence is not maintained)
// Sorted (elements are sorted before they are added in the Queue
//does not allow null values
// it allows duplicate elements 

public class Day12_13 {

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(25);
		pq.add(15);
		pq.add(10);
		pq.add(5);
		pq.add(45);
		System.out.println("Queue = "+pq);
		//pq.add(null); // does not allow null // NPE
		pq.add(45);
		System.out.println("Queue = "+pq);
		
		

	}

}
