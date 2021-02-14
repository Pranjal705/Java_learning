package oops.inheritancePractice.question1.question4;

public class Rectangle {
	double length;
	double breadth;
	
	public void setDimensions(double l, double b)
	{
		length = l;
		breadth = b;
	}
	
	public void Perimeter()
	{
		System.out.println("The perimeter of rectangle having length " + length + " and breadth " + breadth + " is " + 2 *(length + breadth));
	}
	
	public void Area()
	{
		System.out.println("The Area of rectangle having length " + length + " and breadth " + breadth + " is " + length * breadth);
		
		
	}
}
