
import java.util.ArrayList;
import static streamsTasks.Display.*;
public class Task5 {
	public static void main(String[] args)
	{
		ArrayList<String> arrli = new ArrayList<>();
		arrli.add("Adilabad");
		arrli.add("Agra");
		arrli.add("Agarthala");
		arrli.add("Adoor");
		arrli.add("Hyderabad");arrli.add("Begumpet");
		arrli.add("Banagalore");arrli.add("Habsiguda");
		
		long val  = arrli.stream().filter(s -> s.startsWith("Ag")).count();
		
		print("Number of strings starting with 'Ag' are : " + val);
	}
}