package com.uttara.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCHelper {

	public static Connection getConnection()
	{
		try
		{
			Class.forName(Constants.DRIVER);
			Connection con = DriverManager.getConnection(Constants.URL,Constants.UID,Constants.PWD);
			
			return con;
		}
		catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static void close(ResultSet rs)
	{
		if(rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static void close(Statement s)
	{
		if(s != null)
			try {
				s.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void close(Connection c)
	{
		if(c != null)
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

