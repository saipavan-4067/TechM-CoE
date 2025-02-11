package assignments_30Jan;
import java.util.Scanner;
public class Last_Character_In_Every_Word {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = sc.nextLine();
		String[] arr = s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length() == 0)
		        continue;
			char ch = arr[i].charAt(arr[i].length()-1);
			if(ch >= '0' && ch <= '9' || ch == ' ')
				continue;
			System.out.print(ch);
		}
	}
}
