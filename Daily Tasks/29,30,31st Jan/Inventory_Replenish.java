package assignments_30Jan;
import java.util.Scanner;

public class Inventory_Replenish {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of inventories : ");
		int n = sc.nextInt();
		Inventory[] objs = new Inventory[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Inventory Id for Inventory"+(i+1) +" : ");
			String s = sc.next();
			System.out.print("Enter maximumQuantity for Inventory"+(i+1) +" : ");
			int maximumQnty = sc.nextInt();
			System.out.print("Enter currentQuantity for Inventory"+(i+1) +" : ");
			int currentQnty = sc.nextInt();
			System.out.print("Enter threshold for Inventory"+(i+1) +" : ");
			int threshold = sc.nextInt();
			objs[i] = new Inventory(s,maximumQnty,currentQnty,threshold);
		}
		System.out.print("Enter the limit value : ");
		int limit = sc.nextInt();
		Inventory[] ans = Solution1.replenish(objs,limit);
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i].inventoryId + " ");
			if(ans[i].threshold > 75)
				System.out.println("Critical Filling");
			else if(ans[i].threshold >= 75 && ans[i].threshold <= 50)
				System.out.println("Moderate Filling");
			else 
				System.out.println("Non-Critical Filling");
		}
	}
}
class Inventory
{
	String inventoryId;
	int maximumQuantity;
	int currentQuantity;
	int threshold;
	public Inventory(String inventoryId,int maximumQuantity,int currentQuantity,int threshold)
	{
		this.inventoryId = inventoryId;
		this.maximumQuantity = maximumQuantity;
		this.currentQuantity = currentQuantity;
		this.threshold = threshold;
	}
	public Inventory getInventory()
	{
		return this;
	}
	public void setInventory(String inventoryId,int maximumQuantity,int currentQuantity,int threshold)
	{
		this.inventoryId = inventoryId;
		this.maximumQuantity = maximumQuantity;
		this.currentQuantity = currentQuantity;
		this.threshold = threshold;
	}
}
class Solution1
{
	public static Inventory[] replenish(Inventory[] arr,int limit)
	{
		int cnt = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].threshold <= limit)
				cnt++;
		}
		Inventory[] ans = new Inventory[cnt];
		int idx = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].threshold <= limit)
				ans[idx++] = arr[i];
		}
		return ans;
	}
}
