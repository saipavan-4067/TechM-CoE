
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static streamTasks.Display.*;
public class Task7 {
	public static void main(String[] args)
	{
		ArrayList<Integer> arrli = new ArrayList<>();
		
		arrli.add(1);arrli.add(1);arrli.add(30);
		arrli.add(2);arrli.add(10);arrli.add(-1);
		arrli.add(3);arrli.add(20);arrli.add(-19);
		
		Optional<Integer> max = arrli.stream().reduce((i,j) -> (i>j?i:j));
		
		Optional<Integer> min = arrli.stream().reduce((i,j) -> (i<j?i:j));
		
		print("Maximum value is : " + max.get());
		print("Minimum value is : " + min.get());
	}
}