package JDBC;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
public class Select {
	public static void main(String[] args)
	{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm","root","tiger");
			System.out.println("Connection is established");
			PreparedStatement ps = conn.prepareStatement("select * from employee");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				System.out.print(rs.getInt(1) + " ");
				System.out.print(rs.getString(2) + " ");
				System.out.print(rs.getString(3) + " ");
				System.out.println();
			}
			
			rs.close();
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