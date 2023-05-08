import java.util.Stack;

//search() 

public class Day12_6 {

	public static void main(String[] args) 
	{
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(11);
		stk.push(22);
		stk.push(33);
		stk.push(44);
		stk.push(55);
		System.out.println("Stack Contents = "+stk);
		System.out.println("Search = "+stk.search(22));
		// 11 ===> first  ===> top = 1  ===> 5th position 
		// 22 ===> second ===> top = 2  ===> 4th position 
		// 33 ===> third ==> top = 3 ===> 3rd position 
		// 44 ===> fourth  ==> top = 4 ===> 2nd position 
		//55 ===> fifth  ==> top = 5   ===> 1st position 
		
		// position ===> 1-based position
		
		
		
	}
}



/*
// push() , pop(), peek(), empty()

public class Day12_6 {

	public static void main(String[] args) 
	{
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(11);
		stk.push(22);
		stk.push(33);
		System.out.println("Stack Contents = "+stk);
		System.out.println("Peek = "+stk.peek());
		System.out.println("Pop = "+stk.pop());
		System.out.println("Pop = "+stk.pop());
		System.out.println("Pop = "+stk.pop());
		System.out.println("Stack = "+stk);
		System.out.println("Stack is empty?? "+stk.empty());
		stk.pop();
		
		
	}

}
*/