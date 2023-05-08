
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Requirement
// class Movie
//rating,name,year
// few objects of Movie type
// add these objects in some List Collection (ArrayList)
// sort the movie based on year (Comparable) 
//sort the movie based on name (Comparator)
//sort the movie based on rating (Comparator)



class Movie implements Comparable<Movie>
{
	private String name;
	private double rating;
	private int year;
	
	public Movie()
	{
		
	}
	public Movie(String name, double rating, int year) {
		super();
		this.name = name;
		this.rating = rating;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", rating=" + rating + ", year=" + year + "]";
	}
	
	@Override
	public int compareTo(Movie m) 
	{
		return this.year - m.year;
	}
	
	
}

class RatingCompare implements Comparator<Movie>
{

	@Override
	public int compare(Movie m1, Movie m2)
	{
		if(m1.getRating()<m2.getRating())
			return -1;
		else
			if(m1.getRating()>m2.getRating())
				return 1;
		else return 0;
	}
	
}

class NameCompare implements Comparator<Movie>
{
	public int compare(Movie m1, Movie m2)
	{
		return m1.getName().compareTo(m2.getName());
	}
}


public class Day13_6
{

	public static void main(String[] args) 
	{
		Movie m1=new Movie("abc",4.5,2022);
		Movie m2=new Movie("def",3.5,2019);
		Movie m3=new Movie("xyz",3.0,2023);
		Movie m4=new Movie("pqr",3.2,2018);
		
		ArrayList<Movie> al = new ArrayList<Movie>();
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		
		System.out.println("Before Sort Array List Contents");
		for(Movie m : al)
			System.out.println(m);
		
		Collections.sort(al);
		
		
		System.out.println("After Sort Array List Contents");
		for(Movie m : al)
			System.out.println(m);
		
		RatingCompare rc = new RatingCompare();
		System.out.println("Sorting the AL based on Rating Field");
		Collections.sort(al,rc);
		System.out.println("After Sort Array List Contents");
		for(Movie m : al)
			System.out.println(m);
		
		
		NameCompare nc = new NameCompare();
		System.out.println("Sorting the AL based on Name Field");
		Collections.sort(al,nc);
		
		System.out.println("After Sort Array List Contents");
		for(Movie m : al)
			System.out.println(m);
		
	}

}
