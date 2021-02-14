package oops.inheritancePractice.question1;

public class Main {

	public static void main(String[] args) {
		ParentClass p1 = new ParentClass();
		ChildClass c1 = new ChildClass();
		
		p1.DescriptionParent();
		c1.description();
		c1.DescriptionParent();
	}

}
