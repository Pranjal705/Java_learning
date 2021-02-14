package typeCastingAndUserInput;
import java.util.Scanner; // Scanner module

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Creating Object for Scanner Class
		
		int principal = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		
		double simpleinterest = (principal * rate * time) / 100;
		System.out.println(simpleinterest);
	}

}
