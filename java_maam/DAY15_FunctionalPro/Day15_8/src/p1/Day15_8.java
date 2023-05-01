package p1;

import java.lang.annotation.Annotation;


public class Day15_8 {

	public static void main(String[] args) 
	{
		Class c = Book.class;
		Annotation arr[]=c.getDeclaredAnnotations();
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		for(Annotation a : arr)
		{
			if(a instanceof Author)
			{
				Author at = (Author) a;
				System.out.println("Fetch the information about author");
				System.out.println("First Name = "+at.firstName());
				System.out.println("Last Name = "+at.lastName());
				
			}
			else
				System.out.println("It is not an author annotaion");
		}
	}
}



/*
//know the annotations used in book.java file

public class Day15_8 {

	public static void main(String[] args) 
	{
		Class c = Book.class;
		Annotation arr[]=c.getDeclaredAnnotations();
		for(Annotation a : arr)
			System.out.println(a);

	}

}
*/