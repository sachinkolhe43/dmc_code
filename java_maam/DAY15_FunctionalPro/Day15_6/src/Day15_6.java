
// functional interface and lambda
// can we have more than one functional interface in one java file?YES
// each functional interface must have only ONE ABSTRACT METHOD.

@FunctionalInterface
interface MathAdd
{
	public int getAddition(int num1,int num2);
	
}

@FunctionalInterface
interface MathSub
{
	public int getSubtraction(int num1,int num2);
	
}
@FunctionalInterface
interface MathMul
{
	public int getMultiplication(int num1,int num2);
	
}


@FunctionalInterface
interface MathDiv
{
	public int getDivision(int num1,int num2);
	
}




public class Day15_6 
{

	public static void main(String[] args) 
	{
		MathAdd ma = (n1,n2) -> {return n1 + n2;};
		System.out.println("Addition = "+ma.getAddition(5,4));
		
		MathSub ms = (n1,n2) -> {return n1 - n2;};
		System.out.println("Subtraction = "+ms.getSubtraction(15,14));
	
		
		MathMul mm = (n1,n2) -> {return n1 * n2;};
		System.out.println("Multiplication = "+mm.getMultiplication(20, 3));
		
		MathDiv md = (n1,n2) -> {return n1 / n2;};
		System.out.println("Division = "+md.getDivision(50, 5));
	}

}
