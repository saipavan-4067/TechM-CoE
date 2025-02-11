package assignments_30Jan;

import java.util.Scanner;
public class Associate_For_Given_Technology {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of employees : ");
		int n = sc.nextInt();
		Associate[] objs = new Associate[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the id of candidate - " + (i+1)+ " : ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the name of candidate - " + (i+1) + " : ");
			String s = sc.nextLine();
			System.out.print("Enter the technology of candidate - " + (i+1) + " : ");
			String technology = sc.nextLine();
			System.out.print("Enter the years of exp candidate -" + (i+1) + " : ");
			int years = sc.nextInt();
			sc.nextLine();
			objs[i] = new Associate(id,s,technology,years);
		}
		System.out.print("Enter the technology you want to search : ");
		String technology = sc.nextLine();
		Associate[] ans = Solution.associatesForGivenTechnology(objs,technology);
		for(int i=0;i<ans.length;i++)
		{
			System.out.println(ans[i].id);
		}
//		Associate[] objs = new Associate[2];
//		objs[0] = new Associate(101,"Siva Harshith","Java",20);
//		objs[1] = new Associate(102,"Shiva Ram","Python",30);
//		Associate test = objs[0].getAssociate();
//		System.out.println(test.id+" " + test.name + " " + test.technology + " " + test.experienceInYears);
//		objs[0].setAssociate(100, "Arjun Reddy", "Python", 20);
//		test = objs[0].getAssociate();
//		System.out.println(test.id+" " + test.name + " " + test.technology + " " + test.experienceInYears);
	}
}
class Associate 
{
	int id;
	String name;
	String technology;
	int experienceInYears;
	public Associate(int id,String name,String technology,int experienceInYears)
	{
		this.id = id;
		this.name = name;
		this.technology = technology;
		this.experienceInYears = experienceInYears;
	}
	public Associate getAssociate()
	{
		return this;
	}
	public void setAssociate(int id,String name,String technology,int experienceInYears)
	{
		this.id = id;
		this.name = name;
		this.technology = technology;
		this.experienceInYears = experienceInYears;
	}
}
class Solution 
{
	public static Associate[] associatesForGivenTechnology(Associate[] arr,String searchTechnology)
	{
		int cnt = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].technology.equalsIgnoreCase(searchTechnology) && arr[i].experienceInYears%5 == 0)
			{
				cnt++;
			}
		}
		Associate[] ans = new Associate[cnt];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].technology.equalsIgnoreCase(searchTechnology) && arr[i].experienceInYears%5 == 0)
			{
				ans[i] = arr[i];
			}
		}
		return ans;
	}
}
