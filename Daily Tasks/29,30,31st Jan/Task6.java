package task_30Jan;

public class Task6 {
	public static void main(String[] args)
	{
		Employee e = new Employee(1,"Siva Harshith",700000,29);
		e.getEmployeeDetails();
		e.getLoanEligibility();
	}
}
class Employee 
{
	private int empId;
	private String empName;
	private double sal;
	private int years;
	public Employee(int empId,String empName,double sal,int years)
	{
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
		this.years = years;
	}
	public void getEmployeeDetails()
	{
		System.out.println("------Employee Details-------");
		System.out.println("Employee id : " + this.empId);
		System.out.println("Employee Name : " + this.empName);
		System.out.println("Employee Salary : " + this.sal);
		System.out.println("Employee years : " + this.years);
	}
	public void setEmployeeDetails(int empId,String empName,double sal,int years)
	{
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
		this.years = years;
	}
	public void getLoanEligibility()
	{
		if(this.years > 5)
		{
			if(this.sal > 600000)
				System.out.println("You are eligible for 2 lakhs loan");
			else if(this.sal > 1000000)
				System.out.println("You are eligible for 5 lakhs loan");
			else if(this.sal > 1500000)
				System.out.println("You are eligile for upto 7 lakhs loan");
			else 
				System.out.println("You are not eligible for loan");
		}
		else 
			System.out.println("You are not eligible for loan");
	}
}
