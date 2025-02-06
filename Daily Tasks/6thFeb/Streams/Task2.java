
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Task2 {
	public static void main(String[] args)
	{
		ArrayList<String> arrli = new ArrayList<>();
		
		arrli.add("PaVan");
		arrli.add("vaRmA");
		arrli.add("ShivA");
		arrli.add("HarshiTH");
		arrli.add("harsHa");
		arrli.add("RaJU");
		
		System.out.println("ArrayList : " + arrli);
		
		List<String> ans1 = convertToLower(arrli);
		System.out.println("Modified arraylist : " + ans1);
		
		List<String> ans2 = convertToUpper(arrli);
		System.out.println("Modified arraylist : " + ans2);
		
	}
	public static List<String> convertToLower(ArrayList<String> arrli)
	{
		List<String> ans = arrli.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
		return ans;
	}
	public static List<String> convertToUpper(ArrayList<String> arrli)
	{
		List<String> ans = arrli.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		return ans;
	}
}