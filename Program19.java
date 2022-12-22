//19.	Develop a program to display the name and roll_no of students from Student table having percentage >70.

import java.sql.*;

class Program19 
{
	public static void main(String []ar) throws Exception 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		Statement st = conn.createStatement();
		ResultSet rs =  st.executeQuery("select * from student where per>70.00");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
		}
		st.close();
		conn.close();
	}
}