package CaseStudy3;

public class Admin extends Payroll
{
	private String name;
	private int salary;
	Admin()
	{
		
	}
	public Admin(String name, int salary)
	{
		this.name=name;
		this.salary=salary;
		super.adjustSalary(salary);
	}
	public void doAdminStaff()
	{
		System.out.println("Admin Stuffs are beind done!!");
	}
}
