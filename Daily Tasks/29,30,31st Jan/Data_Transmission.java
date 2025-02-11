package assignments_30Jan;
import java.util.Scanner;
public class Data_Transmission {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input : ");
		String s = sc.nextLine();
		String[] arr = s.split(" ");
		int max1 = 0,max2 = 0;
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(i == arr.length-1)
			{
				arr[i] = arr[i].substring(0,arr[i].length()-1);
			}
			int val = Integer.parseInt(arr[i]);
			if(isPrime(val))
			{
				sum++;
				if(val > max1)
				{
					max2 = max1;
					max1 = val;
				}
				if(val > max2 && val < max1)
					max2 = val;
			}
		}
		System.out.println(max1 + " " + max2);
		sum += max2;
		System.out.println(sum);
	}
	public static boolean isPrime(int n)
	{
		if(n == 0 || n == 1)
			return false;
		if(n == 2 || n == 3)
			return true;
		if(n%2 == 0 || n%3 == 0)
			return false;
		for(int i=5;i*i<=n;i+=6)
		{
			if(n%i == 0 || n%(i+2) == 0)
				return false;
		}
		return true;
	}
}
