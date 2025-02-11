package assignments_30Jan;
import java.util.Scanner;
public class Character_At_Odd_Position {
	public static void main(String[] args)
	{
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		for(int i=1;i<s.length();i+=2)
		{
			sb.append(s.charAt(i));
		}
		System.out.println(sb);
	}
}
