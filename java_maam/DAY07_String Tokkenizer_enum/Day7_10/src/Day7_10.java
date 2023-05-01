 // In this example 
// Student class is not having implementation of equals() and hashcode()
// so in this example when we use equals() 
// equals() will be called from Object class (reference equality)

class Student
{
	private String name;
	private int rollno;
	private int marks;
	
	public Student() 
	{
		
	}

	public Student(String name, int rollno, int marks) 
	{
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", marks=" + marks + "]";
	}
	
	
	
	
	
	
}
public class Day7_10 {

	public static void main(String[] args) 
	{
		Student s1 = new Student("st1",2,90);
		Student s2=new Student("st1",2,90);
		Student s3 = s1;
		System.out.println(s1==s2); // false
		System.out.println(s1==s3); // true 
		System.out.println(s1.equals(s2)); // false 
		// equals() is getting called from Object class
		// Object class equals() is checking reference equality 
		// is s1 == s2 ??? NO ==> FALSE 
		System.out.println(s1.equals(s3)); //true 
	}

}
