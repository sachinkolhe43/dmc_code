package p1;

import java.util.HashMap;
import java.util.Map;

public class Day16_8 {

	public static void main(String[] args) 
	{
		Map<Integer,Student> map = new HashMap<>();
		Student s;
		s=new Student(12,"s1",85);
		map.put(s.getRollno(), s);
		s=new Student(11,"s2",95);
		map.put(s.getRollno(), s);
		s=new Student(22,"s4",55);
		map.put(s.getRollno(), s);
		s=new Student(34,"s3",45);
		map.put(s.getRollno(), s);
		s=new Student(10,"s5",67);
		map.put(s.getRollno(), s);
		System.out.println(map);
		
		System.out.println("Sort the stream of students based on name");
		map.values().stream()
		.sorted((s1,s2) -> s1.getName().compareTo(s2.getName()))
		.forEach(System.out::println);
		
		System.out.println("Sort the stream of students based on marks");
		map.values().stream()
		.sorted((s1,s2) -> Double.valueOf(s1.getMarks()).compareTo(s2.getMarks()))
		.forEach(System.out::println);
		
		
		

	}

}
