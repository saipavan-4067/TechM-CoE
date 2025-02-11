package assignments_30Jan;
import java.util.Scanner;
public class Vowels_Consonants_Count {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.nextLine();
		int vowels = 0,conso = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')
				vowels++;
			else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				conso++;
		}
		System.out.println("Vowels count - " + vowels);
		System.out.println("Consonants count - " + conso);
	}
}
