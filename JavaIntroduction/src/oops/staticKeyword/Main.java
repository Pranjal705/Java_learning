package oops.staticKeyword;
import oops.staticKeyword.OuterClass.StaticNestedClass;
import oops.staticKeyword.OuterClass.InnerClass;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		System.out.println(Person.breed);
		System.out.println(p1.breed);
		
		// To instantiate the static nested class we did not need the outer class object
		StaticNestedClass NestedClassObj = new StaticNestedClass();
		NestedClassObj.Greet();
		
		// To instantiate the non-static nested class we needed the outer class object
		OuterClass outerclassObj = new OuterClass();
		InnerClass innerClassobj = outerclassObj.new InnerClass();
		
		innerClassobj.Display();
	}

}
