// Association
// Employee has-a dateofjoining(doj)
// Employee has-a DateObject

class Date
{
	private int dd;
	private int mm;
	private int yy;
	
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
} //end of Date class

class Employee
{
	int empid; 
	Date dobj=new Date(); //represent Association //dobj is object //local object
	
	
	
	@Override
	public String toString() 
	{
		return "Employee [empid=" + empid + ", dobj=" + dobj + "]";
	}
	
	void disp()
	{
		System.out.println("Empid = "+this.empid);
		System.out.println("Date = "+dobj.getDd()+"\t"+dobj.getMm()+"\t"+dobj.getYy());
	}
	
}







public class Day4_3 {

	public static void main(String[] args) 
	{
		Employee e = new Employee();
		//System.out.println(e);
		e.disp();
	}

}
