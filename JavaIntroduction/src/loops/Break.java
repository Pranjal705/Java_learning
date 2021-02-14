package loops;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		// Taking an integer as an input from the user continuosly until a negative integer is given
		Scanner sc = new Scanner(System.in);
		int a = 0;
		System.out.println("Enter inputs: ");
		for(;;)
		{
			a = sc.nextInt();
			if(a<0)
				break;
		}

	}

}
