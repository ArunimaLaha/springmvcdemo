package com.cts.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtility {
	
	public static Connection getConnection()
	{
		ResourceBundle rb=ResourceBundle.getBundle("db");
		String driver=rb.getString("driver");
		String url=rb.getString("url");
		String username=rb.getString("username");
		String password=rb.getString("password");
		Connection con=null;
		try
		{
			System.out.println(driver);
			Class.forName(driver);
			con=DriverManager.getConnection(url,username,password);
			
		}
		catch(ClassNotFoundException cnf)
		{
			cnf.printStackTrace();
		}
		catch(SQLException sql)
		{
			sql.printStackTrace();
		}
		return con;
	}

}
