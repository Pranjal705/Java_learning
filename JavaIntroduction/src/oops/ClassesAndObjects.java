package oops;

class Dog {
	String name, breed;
	
	public void jump()
	{
		System.out.println(name + " is jumping.");
	}
	
	public void description()
	{
		System.out.println("The dog's name is " + name + " and the breed is " + breed + ".");
	}
}

public class ClassesAndObjects {
	
	
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		dog1.name = "Browny";
		dog2.name = "Moolchand ji";
		dog1.breed = "Labrador";
		dog2.breed = "pug";
		
		dog1.jump();
		dog1.description();
		
		dog2.jump();
		dog2.description();;

	}

}
