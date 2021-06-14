package foodorderapp.com.capgemini.app.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Menu {
	static Connection con=null;
	static Statement stmt=null;
	static PreparedStatement pstmt=null;
	static ResultSet rs=null;
	static Scanner sc=new Scanner(System.in);
	//method to establish the connection
	public Connection dbConnection() {
		try {
			//step 1: register the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step 2: Establish the connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Popo@1991");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;

	}//close of db connection method
	public void createMenuTable() {
		try {
			stmt=con.createStatement();
			String createTable="create table menu(mname varchar(30),vid int,price int,foreign key(vid) references vendor(vid))";
			int i=stmt.executeUpdate(createTable);
			if(i==0) {
				System.out.println("Menu Table created successfully");
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
	public void insertMenu() {
		// TODO Auto-generated method stub
			try {
				stmt=con.createStatement();
				String insertData1="insert into menu values('vanilla icecream',11,20)";
				stmt.executeUpdate(insertData1);
				String insertData2="insert into menu values('chocolate icecream',11,30)";
				stmt.executeUpdate(insertData2);
				String insertData3="insert into menu values('blackcurrent icecream',11,50)";
				stmt.executeUpdate(insertData3);
				String insertData4="insert into menu values('pizza',12,400)";
				stmt.executeUpdate(insertData4);
				String insertData5="insert into menu values('pasta',12,250)";
				stmt.executeUpdate(insertData5);
				String insertData6="insert into menu values('rosogolla',13,10)";
				stmt.executeUpdate(insertData6);
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
	public void displayMenuById(int cid,int int1) {
		// TODO Auto-generated method stub
		try {
		String dis="select * from menu where vid=?";
		pstmt=con.prepareStatement(dis);
		pstmt.setInt(1, int1);
		rs=pstmt.executeQuery();
		System.out.println("MenuName"+"\t"+"Price");
		while(rs.next()) {
			System.out.println("==================================");
			System.out.println(rs.getString(1)+"\t"+rs.getInt(3));

		}
		int totalprice=0;
		System.out.println("Select fooditem: ");
		String choice=sc.nextLine();
		String ch="select price from menu where mname=?";
		pstmt=con.prepareStatement(ch);
		pstmt.setString(1, choice);
		rs=pstmt.executeQuery();
		while(rs.next()) {
			totalprice+=rs.getInt(1);
		}
		System.out.println(choice+" Price:"+totalprice);	
		Order o=new Order();
		o.insertOrders(cid,totalprice);
		}
		catch(SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}