//final reference
// if we wish that a reference must point to only one memory area of object
// it should not be changed at later stage or else we receive javac error

class Student
{
	int rollno;
	int marks;
	Student()
	{
		this.rollno=1;
		this.marks=50;
	}
	Student(int rollno,int marks)
	{
		this.rollno=rollno;
		this.marks=marks;
	}
	
	void disp()
	{
		System.out.println("Roll no = "+this.rollno+" Marks = "+this.marks);
	}
	
}


public class Day4_7 {

	public static void main(String[] args) 
	{
		final Student s1 = new Student(8,75);
		s1.disp();
		//s1=new Student(6,45); // s1 can not point to new memory allocation
		// s1 is declared as final reference 
	}
}



/*

public class Day4_7 {

	public static void main(String[] args) 
	{
		Student s1 = new Student(25,85);
		s1.disp();
		s1=new Student(4,90);
		s1.disp();
		
	}

}
*/