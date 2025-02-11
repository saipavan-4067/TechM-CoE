package assignments_30Jan;
import java.util.Scanner;
public class Perfect_Square {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int n = sc.nextInt();
		if(isSquare(n))
			System.out.println(true);
		else 
			System.out.println(false);
	}
	public static boolean isSquare(int n)
	{
		int left = 1,right = n;
		while(left <= right)
		{
			int mid = left + (right-left)/2;
			int square = mid*mid;
			if(square == n)
				return true;
			else if(square < n)
				left = mid + 1;
			else 
				right = mid - 1;
		}
		return false;
	}
}
