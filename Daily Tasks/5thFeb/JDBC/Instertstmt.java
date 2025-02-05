package JDBC;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
public class Instertstmt {
	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm","root","tiger");
			System.out.println("Connection is Established");
			
]			PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?)");
			
			ps.setInt(1, 2);
			ps.setString(2, "Varun");
			ps.setInt(3, 40000);
			
			int val = ps.executeUpdate();
			
			System.out.println(val + " Row is inserted into table");
			ps.close();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");
			e.printStackTrace();
		}
	}
}