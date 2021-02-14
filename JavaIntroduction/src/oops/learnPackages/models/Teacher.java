package oops.learnPackages.models;

public class Teacher {
	public String name;
	private String password;
	int roll; // This state is only accesible inside the Models package(Parent Package)
	
	public String getPassword()
	{
		return password;
	}
	
	public Teacher(String name, String password)
	{
		this.name = name;
		this.password = password;
	}
}
	