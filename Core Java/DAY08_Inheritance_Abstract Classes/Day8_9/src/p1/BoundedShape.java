package p1;

public abstract class BoundedShape 
{
	int x,y;
	BoundedShape(int x,int y)
	{	
		this.x=x;
		this.y=y;
	}
	
	
	//adding a common method in super class,
	// which may be implemented at the later stage 
	// supply the declaration
	
	public abstract double area();


	@Override
	public String toString() {
		return "BoundedShape [x=" + x + ", y=" + y + "]";
	}
	

}
