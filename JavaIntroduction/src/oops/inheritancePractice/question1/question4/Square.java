package oops.inheritancePractice.question1.question4;

public class Square extends Rectangle {
	
	public void setDimensions(double l, double b)
	{
		if(l == b)
		{
			length = l;
			breadth = b;			
		}
		else
		{
			System.out.println("Invalid dimensions entered");
		}
	}
}
