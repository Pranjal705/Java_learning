package classAssignments;
import java.util.*;
public class GreatestOfThree {

	public static void main(String[] args) {
		// Write a java program to find greatest number between three
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int greatest = findGreatest(a,b,c);
		System.out.println(greatest);
	}
	
	public static int findGreatest(int a, int b, int c)
	{
		if(a>b)
		{
			if(a>c)
			{
				return a;
			}
			else
			{
				return c;
			}
		}
		else
		{
			if(b>c)
			{
				return b;
			}
			else
			{
				return c;
			}
		}
	}

}
