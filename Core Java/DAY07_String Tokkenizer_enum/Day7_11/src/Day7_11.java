import java.util.Objects;

// In this example 
// Student class is having implementation of equals() and hashcode()
// so in this example when we use equals() 
// equals() will be called from Student class



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

	@Override
	public int hashCode() {
		return Objects.hash(marks, name, rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks && Objects.equals(name, other.name) && rollno == other.rollno;
	}
	
	
	
	
	
	
}
public class Day7_11 {

	public static void main(String[] args) 
	{
		Student s1 = new Student("st1",2,90);
		Student s2=new Student("st1",2,90);
		Student s3 = s1;
		System.out.println(s1==s2); // false
		System.out.println(s1==s3); // true 
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); //true 
	}

}
