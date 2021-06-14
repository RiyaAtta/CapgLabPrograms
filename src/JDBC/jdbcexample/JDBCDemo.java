package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			//step1:Register the Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step 2:Establish the connection

			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","riya");

			//create statement
			Statement stmt=con.createStatement();

			//step 4:execute the sql statement

			ResultSet rs=stmt.executeQuery("select * from department");
			while(rs.next())
			{
				System.out.println("DID"+"\t"+"DNAME");
				System.out.println("==================");
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));

			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			System.out.println("Closed the DB Connection");
			//step 5:close the connection
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}



	}

}