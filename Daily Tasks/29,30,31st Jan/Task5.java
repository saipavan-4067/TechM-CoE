package task_30Jan;
import java.lang.StringBuffer;
import java.util.Scanner;
public class Task5 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		System.out.println("Enter the String : ");
		sb.append(sc.nextLine());
		for(int i=0;i<sb.length();i+=2)
		{
			sb = new StringBuffer(sb.substring(0,i) + sb.substring(i,i+1).toUpperCase() + sb.substring(i+1));
		}
		System.out.println(sb);
	}
}
