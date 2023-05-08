package p1;

public class Rectangle extends BoundedShape 
{
	int l,b;
	Rectangle(int x,int y,int l,int b)
	{
		super(x,y);
		this.l=l;
		this.b=b;
	}
	@Override
	public double area() {
		System.out.println("Inside area method of Rectangle class");
		return this.l * this.b;
	}
	
	

}
