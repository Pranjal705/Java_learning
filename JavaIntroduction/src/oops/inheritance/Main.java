package oops.inheritance;

public class Main {
	static
	{	// Static blocks will always execute before main method
		System.out.println("This is block 1");
	}
	public static void main(String[] args) {
		
		Person Random = new Person("Rakshit");
		Random.walk();
		System.out.println(Random.heart);
		
		System.out.println();
		
		Teacher Adarsh = new Teacher("Adarsh");
		System.out.println(Adarsh.heart);
		Adarsh.teach();
		Adarsh.eat();
		Adarsh.walk();
		
		System.out.println();
		
		Singer Pranjal = new Singer("Pranjal");
		System.out.println(Pranjal.heart);
		Pranjal.eat();
		Pranjal.sing();
		Pranjal.walk();

	}

	static
	{
		System.out.println("This is block 2");
	}
}
