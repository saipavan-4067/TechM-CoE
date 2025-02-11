package assignments_30Jan;
import java.util.Scanner;
public class Reverse_String {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.next();
		s = s.toLowerCase();
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}
}
