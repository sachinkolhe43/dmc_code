package p1;

public class Manager 
{
	int mid;
	String name;
	
	public Manager()
	{
		this.mid=12345;
		this.name="DEFAULT";
	}

	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", name=" + name + "]";
	}
	
}
