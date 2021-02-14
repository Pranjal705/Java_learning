package oops.encapsulations;

public class Student {
	private int age;
	private String name;
	
	public int getAge()
	{
		return age;
	}
	
	
	public void setAge(int age)
	{
		if(age>20)
		{
			System.out.println("You are too old.");
		}
		else
		{
			this.age = age;
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		String regularExpressions = "^[A-Z][a-zA-z ]{8,30}";
		if(name.matches(regularExpressions) && this.age != 0)
		{
			this.name = name;
		}
		else
		{
			System.out.println("Invalid Name or Age!");
		}
	}
}
