package foodorderapp.com.capgemini.app.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Vendor {
	static Connection con=null;
	static Statement stmt=null;
	static PreparedStatement pstmt=null;
	static ResultSet rs=null;
	static Scanner sc=new Scanner(System.in);
	int cid,tem;
	//method to establish the connection
	public Connection dbConnection() {
		try {
			//step 1: register the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step 2: Establish the connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "riya");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;

	}//close the dbConnection
	public void createVendor() {
		try {
			stmt=con.createStatement();
			String createTable="create table vendor(vid int primary key,vname varchar2(30))";
			int i=stmt.executeUpdate(createTable);
			if(i==0) {
				System.out.println("Vendor Table created successfully");
			}
			else {
				System.out.println("Table not created");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void insertVendor() {
		// TODO Auto-generated method stub
			try {
				stmt=con.createStatement();
				String insertData1="insert into vendor values(11,'Icecream shop')";
				stmt.executeUpdate(insertData1);
				String insertData2="insert into vendor values(12,'Dominoes')";
				stmt.executeUpdate(insertData2);
				String insertData3="insert into vendor values(13,'Sweets shop')";
				stmt.executeUpdate(insertData3);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
	public void displayVendor(int cid) {
		// TODO Auto-generated method stub
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from vendor");
			System.out.println("Vid"+"\t"+"Store name");
			while(rs.next()) {
				System.out.println("==================================");
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));

			}
			System.out.println("Enter the shopid: ");
			int temp=sc.nextInt();
			rs=stmt.executeQuery("select * from vendor");
			while(rs.next()) {
				if(rs.getInt(1)==temp) {
					Menu ob=new Menu();
					ob.displayMenuById(cid,rs.getInt(1));
					break;
				}

			}
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}