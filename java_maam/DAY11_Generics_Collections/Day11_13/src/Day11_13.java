
import java.util.ArrayList;

class Student
{
	int rollno;
	int marks;
	String name;
	
	public Student()
	{
		
	}
	
	public Student(int rollno, int marks, String name) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
		
}


public class Day11_13
{

	public static void main(String[] args) 
	{
		Student s1=new Student(1,80,"st1");
		Student s2=new Student(2,85,"st2");
		Student s3=new Student(3,70,"st3");
		Student s4=new Student(4,65,"st4");
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		//System.out.println(list);
		for(Student s : list)
			System.out.println(s);
		
		Student s5 = new Student(5,89,"st5");
		list.add(s5);
		
		System.out.println("After adding record");
		
		for(Student s : list)
			System.out.println(s);
		
		System.out.println(list.remove(s3));
		
		System.out.println("After removing record");
		
		for(Student s : list)
			System.out.println(s);	
		
	}

}
