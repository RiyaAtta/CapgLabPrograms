package foodorderapp.com.capgemini.app.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Order {
	static Connection con=null;
	static Statement stmt=null;
	static PreparedStatement pstmt=null;
	static ResultSet rs=null;
	static int count=1;
	static Scanner sc=new Scanner(System.in);
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

	}//close of db connection method
	public void createOrderTable() {
		try {
			stmt=con.createStatement();
			String createSeq="create sequence seq_OIE start with 1 increment by 1";
			stmt.executeUpdate(createSeq);
			String createTable="create table orderz(oid int primary key,totalprice int,cid int,foreign key(cid) references customers(cid))";
			int i=stmt.executeUpdate(createTable);
			if(i==0) {
				System.out.println("Order Table created successfully");
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
	public void insertOrders(int cid2, int totalprice) {
		// TODO Auto-generated method stub
		try {
			String inOrder="insert into orderz values(seq_OIE.nextval,?,?)";
			pstmt=con.prepareStatement(inOrder);
			pstmt.setInt(1,totalprice);
			pstmt.setInt(2,cid2);
			pstmt.executeUpdate();
		}
		catch(Exception e) {
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
	public void display() {
		// TODO Auto-generated method stub
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from orderz");
			System.out.println("OrderId"+"\t"+"TotalPrice"+"\t"+"CustomerId");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getInt(2)+"\t"+rs.getInt(3));

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