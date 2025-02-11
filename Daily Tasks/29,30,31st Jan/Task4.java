package task_30Jan;
import java.util.Arrays;
public class Task4 {
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6};
		int[] arr2 = Arrays.copyOfRange(arr, 1, 4);
		System.out.println("Copied array is : " + Arrays.toString(arr2));
	}
}
