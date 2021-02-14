package nestedForLoops;

public class TableFrom1To20 {

	public static void main(String[] args) {
		// Make table from 1 to 20
				for(int j=1; j<=20; j++)
				{
					System.out.println("The table of " + j + " is: ");
					for(int i=1; i<=10; i++)
					{
						System.out.println(j + " * "+ i + " = " + j*i);
					}
				}

	}

}
