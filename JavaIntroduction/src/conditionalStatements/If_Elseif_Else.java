package conditionalStatements;
import java.util.Scanner;

public class If_Elseif_Else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Petals plucked: ");
		int numberOfPetals = sc.nextInt();
		
		if(numberOfPetals % 2 == 0)
		{
			System.out.println("He loves me not!");
		}
		else if (numberOfPetals % 2 == 1)
		{
			System.out.println("He loves me!");
		}
		else
		{
			System.out.println("Invalid Input!");
		}

	}

}
