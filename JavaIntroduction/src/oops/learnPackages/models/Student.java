package oops.learnPackages.models;

public class Student {
	public String name;
	private String password;
	int roll; // This state is only accesible inside the Models package(Parent Package)
	
	public String getPassword()
	{
		return password;
	}
	
	public Student(String name, String password)
	{
		this.name = name;
		this.password = password;
	}
}
