package Lab9.lambdaExpressionsandStreamAPI.CaseStudy.com.capgemini;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import Lab9.lambdaExpressionsandStreamAPI.CaseStudy.com.capgemini.model.Department;
import Lab9.lambdaExpressionsandStreamAPI.CaseStudy.com.capgemini.model.Employee;
import Lab9.lambdaExpressionsandStreamAPI.CaseStudy.com.capgemini.service.EmployeeRepository;


public class MainClass {
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		EmployeeRepository.create();
		char ch='y';
		do {
			System.out.println("Employee App: ");
			EmployeeRepository.readEmp();
			EmployeeRepository.readDept();
			System.out.println("=============================");
			System.out.println("Enter 1 to Find out the sum of salary of all employees.");
			System.out.println("Enter 2 to List out department names and count of employees in each department.");
			System.out.println("Enter 3 to Find out the senior most employee of an organization.  ");
			System.out.println("Enter 4 to List employee name and duration of their service in months and days.  ");
			System.out.println("Enter 5 to Find out employees without department. ");
			System.out.println("Enter 6 to Find out department without employees. ");
			System.out.println("Enter 7 Find departments with highest count of employees.");
			System.out.println("Enter 8 to List employee name, hire date and day of week on which employee has started.");
			System.out.println("Enter 9 to List employee name, hire date and day of week for employee started on Friday.");
			System.out.println("Enter 10 to List employee’s names and name of manager to whom he/she reports."
					+ " Create a report in format “employee name reports to manager name”. ");
			System.out.println("Enter 11 to List employee name, salary and salary increased by 15%.");
			System.out.println("Enter 12 to Find employees who didn’t report to anyone (Hint: Employees without manager)");
			System.out.println("Enter 13 to Sort employees by their: Employee id,Department id,First name");
			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println(EmployeeRepository.empList
						.stream()
						.mapToDouble((p)->p.getSalary()).sum());
				break;
			case 2:
				Map<Object, Long> designationWiseTotalCount =
				EmployeeRepository.empList.stream()
				.collect(Collectors
						.groupingBy(p->p.getDepartment().getDepartmentName(),
								Collectors.counting()));
				System.out.println(designationWiseTotalCount.toString());
				break;
			case 3:
				System.out.println(EmployeeRepository.empList
						.stream()
						.min(Comparator.comparing(Employee::getHireDate)));
				break;
			case 4:
				Function<Employee,List<Integer>> calculateDays=p->{
					List<Integer> list=new ArrayList<Integer>();
					Period t=Period.between(p.getHireDate(),LocalDate.now());
					list.add( t.getDays());
					list.add( t.getMonths());
					return list;};
					EmployeeRepository.empList
					.stream().map(calculateDays).forEach(System.out::println);
					break;
			case 5:
				EmployeeRepository.empList
				.stream()
				.filter(p->p.getDepartment()!=null)
				.forEach(System.out::println);
				break;
			case 6:
				Function<Department,List<Department>> deptWithNoEmp=p->{
					List<Department> list=new ArrayList<Department>();
					for(Employee i:EmployeeRepository.empList) {
						if(!(i.getDepartment().getDepartmentId()==p.getDepartmentId())) {
							list.add(p);
						}
					}
					return list;};
					EmployeeRepository.deptList.stream().map(deptWithNoEmp).forEach(System.out::println);
					break;
			case 7:
				Map<Object, Long> departmentWiseTotalCount =
				EmployeeRepository.empList
				.stream()
				.collect(Collectors
						.groupingBy(p->p.getDepartment().getDepartmentId(),
								Collectors.counting()));
				System.out.println(departmentWiseTotalCount);

				break;
			case 8:
				EmployeeRepository.empList
				.stream()
				.filter(p->p.getEmployeeId()!=0)
				.forEach(p->System.out.println(p.getFirstName()+" "+p.getHireDate()+" "+p.getHireDate().getDayOfWeek()));
				break;
			case 9:
				EmployeeRepository.empList
				.stream()
				.filter(p->(p.getHireDate().getDayOfWeek().toString()).equalsIgnoreCase("FRIDAY"))
				.forEach(p->System.out.println(p.getFirstName()+" "+p.getHireDate()+" "+p.getHireDate().getDayOfWeek()));
				break;

			case 10:
				List<Employee> managers=
				EmployeeRepository.empList
				.stream()
				.filter(p->p.getManagerId()!=0)
				.map((p)->p)
				.collect(Collectors.toList());
				Set<String> s=new HashSet<String>();
					for(Employee j: managers) {
						if(EmployeeRepository.empList.contains(j)) {
							for(Employee i: EmployeeRepository.empList) {
							s.add("employee "+i.getFirstName()+" reports to manager: " +j.getFirstName());
						}
						}
					}
					System.out.println(s);
				break;

			case 11:
				EmployeeRepository.empList
				.stream()
				.filter(p->p.getEmployeeId()!=0)
				.forEach(p->System.out.println(p.getFirstName()+" "+p.getSalary()+" "+p.getSalary()*1.15));
				break;
			case 12:
				EmployeeRepository.empList
				.stream()
				.filter(p->p.getManagerId()==0)
				.forEach(System.out::println);	
				break;
			case 13:
				EmployeeRepository.empList
				.stream()
				.filter(p->p.getDepartment()!=null)
				.sorted((p1, p2)->p1.getDepartment().getDepartmentId()-(p2.getDepartment().getDepartmentId()))
				.forEach(System.out::println);

				System.out.println("====================================");
				EmployeeRepository.empList
				.stream()
				.sorted((p1, p2)->p1.getEmployeeId()-(p2.getEmployeeId()))
				.forEach(System.out::println);

				System.out.println("====================================");
				EmployeeRepository.empList
				.stream()
				.sorted((p1, p2)->p1.getFirstName().compareTo(p2.getFirstName()))
				.forEach(System.out::println);	
				System.out.println("====================================");
				break;
			default:
				System.out.println("Wrong choice!");
			}
			System.out.println("Do you want to continue? y/n");
			ch=sc.next().trim().charAt(0);
		}while(ch=='y');
	}
}
