//18.	Develop a program to create employee table in database having two columns emp_id and emp_name

import java.sql.*;

class Program18 
{
	public static void main(String ar[]) throws Exception 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		Statement st = conn.createStatement();
		st.executeUpdate("create table employee (emp_id number(4) , emp_name varchar(20))");
		System.out.println("Table Created");
		st.close();
		conn.close();
	}
}