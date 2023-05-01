package p1;

public class Circle extends BoundedShape
{
	double radius;
	Circle(int x , int y, double radius)
	{
		super(x,y);
		this.radius=radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	@Override
	public double area() 
	{
		System.out.println("Inside area method of Circle class");
		return Math.PI * this.radius * this.radius;
		
	}
	
	
}
