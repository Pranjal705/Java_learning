package oops.inheritancePractice.question1.question4;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Square[] Tensquares = new Square[10];
		double length = 0;
		for(int i=0; i<10; i++)
		{
			length = sc.nextDouble();
			Tensquares[i] = new Square();
			Tensquares[i].setDimensions(length,length);
			Tensquares[i].Area();
			Tensquares[i].Perimeter();
			
		}
		
	}

}
