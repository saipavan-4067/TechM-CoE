package task_30Jan;

import java.util.Arrays;

public class Task3 {
	public static void main(String[] args)
	{
		int arr1[][] = {
				{1,2,3},
				{1,2,3},
				{2,3,1}
			};
		int arr2[][] = {
				{1,2,3},
				{1,2,3},
				{2,3,1}
		};
		System.out.println("Equals : " + Arrays.equals(arr1, arr2));
		System.out.println("DeepEquals : " + Arrays.deepEquals(arr1, arr2));
	}
}
