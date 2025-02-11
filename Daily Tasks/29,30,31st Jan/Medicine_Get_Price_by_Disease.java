package assignments_30Jan;
import java.util.Arrays;
import java.util.Scanner;
public class Medicine_Get_Price_by_Disease {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of medicines : ");
		int n = sc.nextInt();
		sc.nextLine();
		Medicine[] objs = new Medicine[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the medicineName for medicine - " + (i+1) + " : ");
			String medName = sc.nextLine();
			System.out.print("Enter the batch for medicine - " + (i+1) + " : ");
			String batch = sc.nextLine();
			System.out.print("Enter the disease for medicine - " + (i+1) + " : ");
			String disease = sc.nextLine();
			System.out.print("Enter the price for medicine - " + (i+1) + " : ");
			int price = sc.nextInt();
			sc.nextLine();
			objs[i] = new Medicine(medName,batch,disease,price);
		}
		System.out.print("Enter the disease : ");
		String s = sc.nextLine();
		Integer[] ans = Solution2.getPriceByDisease(objs, s);
		for(Integer i : ans)
			System.out.println(i);
	}
}
class Medicine 
{
	String medicineName;
	String batch;
	String disease;
	int price;
	public Medicine(String medicineName,String batch,String disease,int price)
	{
		this.medicineName = medicineName;
		this.batch = batch;
		this.disease = disease;
		this.price = price;
	}
	public Medicine getMedicineDetails()
	{
		return this;
	}
	public String getBatch()
	{
		return this.batch;
	}
	public int getPrice()
	{
		return this.price;
	}
	public String getMedicineName()
	{
		return this.medicineName;
	}
	public void setMedicineDetails(String medicineName,String batch,String disease,int price)
	{
		this.medicineName = medicineName;
		this.batch = batch;
		this.disease = disease;
		this.price = price;
	}
	public void setBatch(String batch)
	{
		this.batch = batch;
	}
	public void setMedicineName(String medName)
	{
		this.medicineName = medName;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
}
class Solution2 
{
	public static Integer[] getPriceByDisease(Medicine[] arr,String disease)
	{
		int cnt = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].disease.equalsIgnoreCase(disease))
				cnt++;
		}
		Integer[] ans = new Integer[cnt];
		int idx = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].disease.equalsIgnoreCase(disease))
			{
				ans[idx++] = arr[i].price;
			}
		}
		Arrays.sort(ans);
		return ans;
	}
}
