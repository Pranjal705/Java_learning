package loops;

public class NestedLoops {

	public static void main(String[] args) {
		// Count 1 to 10 5 times
		
		for(int i=0; i<5; i++)
		{
			for(int j=1; j<=10; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
