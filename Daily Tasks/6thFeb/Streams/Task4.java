
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import static streamsExamples.Display.*;

public class Task4 {
	public static void main(String[] args)
	{
		ArrayList<Integer> arrli = new ArrayList<>();
		
		arrli.add(1);arrli.add(1);arrli.add(1);
		arrli.add(2);arrli.add(2);arrli.add(2);
		arrli.add(1);arrli.add(3);arrli.add(3);
		
		print("ArrayList is : " + arrli);
		List<Integer> ans = arrli.stream().distinct().collect(Collectors.toList());
		print("ArrayList with unique elements : " + ans);
	}
}