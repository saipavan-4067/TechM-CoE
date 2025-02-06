
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import static streamsTasks.Display.*;
public class Task6 {
	public static void main(String[] args)
	{
		ArrayList<String> arrli = new ArrayList<>();
		arrli.add("Hyderabad");
		arrli.add("Delhi");
		arrli.add("Kadapa");
		arrli.add("Warangal");
		arrli.add("Hyderabad");arrli.add("Begumpet");
		arrli.add("Kadapa");arrli.add("Habsiguda");
		
		List<String> ascending = arrli.stream().sorted().collect(Collectors.toList());
		print("The sorted list in ascending order is : " + ascending);
		
		List<String> descending = arrli.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		print("The sorted list in descending order is : " + descending);
	}
}