package oops.inheritance;

public class Singer extends Person {
	String name;
	
	public Singer(String name)
	{
		super(name);
		System.out.println("Singer constructor called");
		this.name = name;
	}
	
	public void sing()
	{
		System.out.println(name + " is singing");
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

