package oops.inheritance;

public class Teacher extends Person {
	String name;
	
	public Teacher(String name)
	{
		super(name);
		System.out.println("Teacher constructor called");
		this.name = name;
	}
	public void teach()
	{
		System.out.println(name + " is teaching");
	}
	 public void eat()
	 {
		 System.out.println(name + " is eating");
	 }
	 public void walk()
	 {
		 System.out.println(name + " is walking");
	 }
}
