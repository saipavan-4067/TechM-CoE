package assignments_30Jan;
import java.util.Scanner;
public class Space_Character_Count {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		int spaces = 0,characters = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == ' ')
				spaces++;
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				characters++;
		}
		System.out.println("Number of Spaces : " + spaces + " Number of Characters : " + characters);
	}
}
