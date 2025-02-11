package task_30Jan;

public class Task1 {
	public static void main(String[] args)
	{
		int[] arr1 = {1,2,3,4,5,6};
		int size = arr1.length/2;
		if(arr1.length%2 == 1)
			size++;
		int[] arr2 = new int[size];
		int j = 0;
		for(int i=0;i<arr1.length;i+=2)
		{
			System.arraycopy(arr1, i, arr2, j, 1);
			j++;
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i] + " ");
		}
	}
}
