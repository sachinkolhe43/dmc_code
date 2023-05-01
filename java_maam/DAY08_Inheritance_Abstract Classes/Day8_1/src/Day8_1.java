// Employee is-a Person
// we have just added two fields in each class
// used getter and setter  and displayed the data

class Person
{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}


class Employee extends Person
{
	private int eid;
	private int salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}



public class Day8_1 
{

	public static void main(String[] args) 
	{
		Employee eobj = new Employee();
		System.out.println(eobj.getName()); 
		System.out.println(eobj.getAge());
		System.out.println(eobj.getEid());
		System.out.println(eobj.getSalary());
		
		eobj.setName("Akshita");
		eobj.setAge(36);
		eobj.setEid(123);
		eobj.setSalary(600000);
		System.out.println(eobj.getName()); 
		System.out.println(eobj.getAge());
		System.out.println(eobj.getEid());
		System.out.println(eobj.getSalary());
		
	}

}
