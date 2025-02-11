package assignments_30Jan;
import java.util.Scanner;
public class Smallest_Vowel_in_a_String {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = sc.next();
		char ch = 'z';
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
			{
				if(s.charAt(i) < ch)
					ch = s.charAt(i);
			}
		}
		System.out.println(ch);
	}
}
