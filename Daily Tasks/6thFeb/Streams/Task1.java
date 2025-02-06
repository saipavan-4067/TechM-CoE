import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class Task1 {
	public static void main(String[] args)
	{
		ArrayList<Integer> arrli = new ArrayList<>();
		for(int i=1;i<=10;i++)
			arrli.add(i);
		System.out.println("ArrayList is : " + arrli);		
		int sum = arrli.stream().reduce(0,(i,j) -> i + j);
		int n = arrli.size();
		double avg = (double)sum/(double)n;
		System.out.println(avg);
	}
}