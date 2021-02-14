package oops.learnPackages;

import oops.learnPackages.models.*;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Pranjal","sahil2504");
		Teacher t1 = new Teacher("Vhallaldev","killBaahubali");
		
		System.out.println(s1.name); // name is accesible because it is public in student.class file
		System.out.println(t1.name); // name is accesible because it is public in student.class file
		
//		System.out.println(s1.password); Not accesible because it is private in student.class file
//		System.out.println(t1.password); Not accesible because it is private in student.class file
		
		System.out.println(s1.getPassword());
		System.out.println(t1.getPassword());
	}

}
