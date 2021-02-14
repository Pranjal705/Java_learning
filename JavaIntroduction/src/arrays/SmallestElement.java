package arrays;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 4, 2, 4, 43 };
		
		int min = a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if (a[i]<min)
			{
				min = a[i];
			}
		}
		System.out.println(min);
	}

}
