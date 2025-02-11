package assignments_30Jan;
import java.util.Scanner;
public class Travel_AgenciesSolution {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Agencies : ");
		int n = sc.nextInt();
		TravelAgencies[] arr = new TravelAgencies[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the regNo : " );
			int regNo = sc.nextInt();
			System.out.print("Enter the agencyName : ");
			String agencyName = sc.next();
			System.out.print("Enter the packageName : ");
			String packageName = sc.next();
			System.out.print("Enter the price : ");
			int price = sc.nextInt();
			System.out.print("Enter the flightFacility : ");
			boolean flightf = sc.nextBoolean();
			arr[i] = new TravelAgencies(regNo,agencyName,packageName,price,flightf);
		}
		System.out.print("Enter the registration number : ");
		int regNo = sc.nextInt();
		System.out.print("Enter the packagetype  : ");
		String packageType = sc.next();
		System.out.println(findAgencyWithHighestPackagePrice(arr));
		TravelAgencies ans = agencyDetailsForGivenldAndType(arr,regNo,packageType);
		if(ans == null)
			System.out.println("No object present");
		else 
			System.out.println(ans.agencyName+ " : "+ ans.price);
	}
	public static int findAgencyWithHighestPackagePrice(TravelAgencies[] arr)
	{
		int max = 0;
		for(int i=0;i<arr.length;i++)
		{
			max = Math.max(max, arr[i].price);
		}
		return max;
	}
	public static TravelAgencies agencyDetailsForGivenldAndType(TravelAgencies[] arr,int regNo,String packageType)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].regNo == regNo && arr[i].flightFacility == true && arr[i].packageType.equalsIgnoreCase(packageType))
			{
				return arr[i];
			}
		}
		return null;
	}
}
class TravelAgencies 
{
	int regNo,price;
	String agencyName,packageType;
	boolean flightFacility;
	public TravelAgencies(int regNo,String agencyName,String packageType,int price,boolean flightFacility)
	{
		this.regNo = regNo;
		this.agencyName = agencyName;
		this.packageType = packageType;
		this.price = price;
		this.flightFacility = flightFacility;
	}
	public int getRegNo()
	{
		return this.regNo;
	}
	public int getPrice()
	{
		return this.price;
	}
	public String getAgencyName()
	{
		return this.agencyName;
	}
	public String getPackageType()
	{
		return this.packageType;
	}
	public boolean getFlightFacility()
	{
		return this.flightFacility;
	}
	public void setFlightFacility(boolean ff)
	{
		this.flightFacility = ff;
	}
	public void setPackageType(String pType)
	{
		this.packageType = pType;
	}
	public void setAgencyName(String agencyName)
	{
		this.agencyName = agencyName;
	}
	public void setRegNo(int regNo)
	{
		this.regNo = regNo;
	}
	public TravelAgencies getTravelAgencyDetails()
	{
		return this;
	}
	public void setTravelAgencyDetails(int regNo,String agencyName,String packageType,int price,boolean flightFacility)
	{
		this.regNo = regNo;
		this.agencyName = agencyName;
		this.packageType = packageType;
		this.price = price;
		this.flightFacility = flightFacility;
	}
}
