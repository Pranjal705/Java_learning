package oops.inheritancePractice.question1.question3;

public class Rectangle {
	double length;
	double breadth;
	
	Rectangle(double l, double b)
	{
		this.length = l;
		this.breadth = b;
	}
	
	public void Area()
	{
		System.out.println(length * breadth);
	}
	
	public void Perimeter()
	{
		System.out.println(2 * (length + breadth));
	}
}
