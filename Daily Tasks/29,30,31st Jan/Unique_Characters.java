package assignments_30Jan;
import java.util.Scanner;
public class Unique_Characters {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.next();
		char ch[] = new char[26];
		for(int i=0;i<s.length();i++)
		{
			if(ch[s.charAt(i)-'a'] == 0)
			{
				System.out.print(s.charAt(i));
				ch[s.charAt(i)-'a']++; 
			}
		}
	}
}
