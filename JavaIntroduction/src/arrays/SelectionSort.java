package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 25, 34, 32, 3, 2, 0};
		int n = a.length;
		for(int i=0; i<n-1; i++)
		{
			int minInd = i;
			for(int j=i; j<n; j++)
			{
				if(a[j]<a[minInd])
				{
					minInd = j;
				}
			}
			if(a[minInd]<a[i])
			{
				int temp = a[i];
				a[i] = a[minInd];
				a[minInd] = temp;
			}
		}
		for(int item: a)
		{
			System.out.print(item + " ");
		}
	}

}
