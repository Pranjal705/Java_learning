package arrays;

import java.util.Scanner;

public class ArrayIntro {

	public static void main(String[] args) {
		// Calculate the average of the marks of the students of class by taking size and marks from the user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the class: ");
		int n = sc.nextInt();
		int[] marks = new int[n];
		System.out.println("Enter the marks of the students: ");
		for(int i=0; i<marks.length; i++)
		{
			marks[i] = sc.nextInt();
		}
		int average = 0;
		int sum = 0;
		
		for(int i=0; i<marks.length; i++)
		{
			sum += marks[i];
		}
		average = sum/marks.length;
		System.out.println("The average marks of the class is: " + average);
	}

}
