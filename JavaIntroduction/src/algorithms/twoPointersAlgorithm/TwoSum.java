package algorithms.twoPointersAlgorithm;
import java.util.*;
// https://www.youtube.com/watch?v=fpq-Sz_tpzM&list=PLKKfKV1b9e8ps6dD3QA5KFfHdiWj9cB1s&index=31
public class TwoSum {
	 public static void main(String[] args)
	 {
		 int[] array = {0, -1, 2, -3, 1};
		 int n = array.length;
		 int i = 0;
		 int j = n-1;
		 int x = 0;
		 int result = 0;
		 
		 Arrays.sort(array);
		 
		 while(i<j)
		 {
			 if(array[i]+array[j]< x)
			 {
				 i++;
			 }
			 else if(array[i]+array[j]> x)
			 {
				 j--;
			 }
			 else if(array[i]+array[j] == x)
			 {
				 result = 1;
				 break;
			 }
		 }
		 
		 if(result == 1)
		 {
			 System.out.println("True");
		 }
		 else
		 {
			 System.out.println("False");
		 }
		 
		 
	 }
}
