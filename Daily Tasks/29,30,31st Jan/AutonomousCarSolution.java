package assignments_30Jan;
import java.util.Scanner;
public class AutonomousCarSolution{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of student details : ");
		int n = sc.nextInt();
		AutonomousCar[] objs = new AutonomousCar[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the carId of car " + (i+1) + " : ");
			int carId = sc.nextInt();
			System.out.print("Enter the brand of car " + (i+1) + " : ");
			String brand = sc.next();
			System.out.print("Enter the noofTestCasesConducted of car " + (i+1) + " : ");
			int noofTestCasesConducted = sc.nextInt();
			System.out.print("Enter the noofTestCasesPassed of car " + (i+1) + " : ");
			int noofTestCasesPassed = sc.nextInt();
			System.out.print("Enter the environment of car " + (i+1) + " : ");
			String environment = sc.next();
			objs[i] = new AutonomousCar(carId,brand,noofTestCasesConducted,noofTestCasesPassed,environment);
		}
		System.out.print("Enter the environment of car : ");
		String env = sc.next();
		System.out.print("Enter the brand of the car : ");
		String brand = sc.next();
		int testcasesPassed = findTestPassedByEnv(objs,env);
		if(testcasesPassed == 0)
			System.out.println("There are no tests passed in this particular environment");
		else 
			System.out.println(testcasesPassed);
		AutonomousCar ans = updateCarGrade(objs,brand);
		if(ans == null)
			System.out.println("“No Car is available with the specified brand");
		else 
			System.out.println(brand+"::"+ans.grade);
	}
	public static int findTestPassedByEnv(AutonomousCar[] arr,String environment)
	{
		int ans = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].environment.equalsIgnoreCase(environment))
				ans += arr[i].noOfTestsPassed;
		}
		return ans;
	}
	public static AutonomousCar updateCarGrade(AutonomousCar[] arr,String brand)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].brand.equalsIgnoreCase(brand))
			{
				int rating = (arr[i].noOfTestsPassed*100)/arr[i].noOfTestsConducted;
				if(rating >= 80)
					arr[i].grade = "A1";
				else 
					arr[i].grade = "B2";
				return arr[i];
			}
		}
		return null;
		
	}
}
class AutonomousCar 
{
	int carId,noOfTestsConducted,noOfTestsPassed;
	String brand,environment,grade;
	public AutonomousCar(int carId,String brand,int noOfTestsConducted,int noOfTestsPassed,String environment)
	{
		this.carId = carId;
		this.brand = brand;
		this.noOfTestsConducted = noOfTestsConducted;
		this.noOfTestsPassed = noOfTestsPassed;
		this.environment = environment;
	}
	public int getcarId()
	{
		return this.carId;
	}
	public String getBrand()
	{
		return this.brand;
	}
	public String getEnvironment()
	{
		return this.environment;
	}
	public AutonomousCar getCarDetails()
	{
		return this;
	}
	public void setCarId(int carId)
	{
		this.carId = carId;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public void setEnvironment(String environment)
	{
		this.environment = environment;
	}
	public void setCarDetails(int carId,String brand,int noOfTestsConducted,int noOfTestsPassed,String environment)
	{
		this.carId = carId;
		this.brand = brand;
		this.noOfTestsConducted = noOfTestsConducted;
		this.noOfTestsPassed = noOfTestsPassed;
		this.environment = environment;
	}
}
