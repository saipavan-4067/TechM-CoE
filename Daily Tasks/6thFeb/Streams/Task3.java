
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

import static streamsExamples.Display.*;
public class Task3 {
	public static void main(String[] args)
	{
		ArrayList<Integer> arrli = new ArrayList<>();
		for(int i=1;i<=10;i++)
			arrli.add(i);
		
		System.out.println("ArrayList is : " + arrli);
		
		int even_sum = arrli.stream().filter(i -> i%2 == 0).reduce(0,(i,j) -> i + j);
		
		int odd_sum = arrli.stream().filter(i -> i%2 == 1).reduce(0, (i,j) -> i + j);
		print("Even sum is : " + even_sum);
		print("Odd sum is : " + odd_sum);
	}
}