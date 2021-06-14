package Lab9.lambdaExpressionsandStreamAPI.CaseStudy.com.capgemini.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Lab9.lambdaExpressionsandStreamAPI.CaseStudy.com.capgemini.model.Department;
import Lab9.lambdaExpressionsandStreamAPI.CaseStudy.com.capgemini.model.Employee;

public class EmployeeRepository {
	public static List<Department> deptList=new ArrayList<Department>();
	public static List<Employee> empList=new ArrayList<Employee>();
	/*
	 * method created to add sample values to the employee collection
	 */
	public static void create() {

		Department d=new Department(10,"Accounting",1200);
		Department d1=new Department(20,"Research",1211);
		Department d2=new Department(30,"Sales",1244);
		Department d3=new Department(40,"Operations",1213);
		deptList.add(d);
		deptList.add(d1);
		deptList.add(d2);
		deptList.add(d3);
		//eid,fName,lName,email,phoneNo,date,designation,sal,mid,null
		Employee e=new Employee(7369,"Smith",
				"Smith","sc@gmail.com","9433305023"
				,LocalDate.parse("2018-12-28"),"Clerk",6000.00,7902,d1);
		Employee e1=new Employee(7499,"Allen",
				"Bros.","abl@gmail.com","9433357572"
				,LocalDate.parse("1998-08-15"),"Salesman",16000.00,7698,d2);
		Employee e2=new Employee(7591,"Ward",
				"Ponting","wppp@gmail.com","9883357572"
				,LocalDate.parse("1996-03-26"),"Salesman",126000.00,7698,d2);
		Employee e3=new Employee(7839,"King",
				"Snow","snow.uyu@gmail.com","9873356672"
				,LocalDate.parse("1990-06-09"),"President",526000.00,0,d);
		Employee e4=new Employee(7902,"Ford",
				"Weas","fordw.uyu@gmail.com","987335892"
				,LocalDate.parse("1997-12-05"),"Analyst",526000.00,7369,null);
		Employee e5=new Employee(7698,"Blake",
				"Potters","fblake.uyu@gmail.com","987338888"
				,LocalDate.parse("1992-06-11"),"Manager",826000.00,7839,d2);
		empList.add(e);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);

	}
	public static void readEmp() {
		for(Employee i: empList) {
			System.out.println(i);
		}
	}
	public static void readDept() {
			for(Department i: deptList) {
				System.out.println(i);
			}
		}
}