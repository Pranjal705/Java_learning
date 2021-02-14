package oops.polymorphism;
// Method overidding is run time polymorphism
// Method overloading is compile time polymorphism
public class MainClass {

	public static void main(String[] args) {
		// Run time polymorphism
		
		Dog d = new Dog();
		
		Pet p = d;
		Animal a = d;
		
		d.walk(); // This will call the walk() method of dog class
		p.walk(); // Here, if we guess, we will think that that walk() method of pet will be invoked but N0!, again, walk() method of dog will be evoked because we have give the reference 		of dog object to the p.
		
		// Compile time polymorphism
		
		greetings(); // Here the compiler know that which exact method is to be called which is not the case in run time polymorphism
		greetings("Pranjal");
		
	}
	
	public static void greetings()
	{
		System.out.println("hi! i am main class!");
	}
	public static void greetings(String name)
	{
		System.out.println("hi! i am " + name + " from main class!");
	}
	
	
	

}
