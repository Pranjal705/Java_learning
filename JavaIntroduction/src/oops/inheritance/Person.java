package oops.inheritance;

public class Person {
 String name;
 static int heart = 1;
 
 public Person(String name)
 {
	 this.name = name;
	 System.out.println("Person constructor called");
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
