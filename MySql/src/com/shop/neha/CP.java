package com.shop.neha;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection con;
	
	public static Connection createC()
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String user = "root";
			String pass = "root";
			String url = "jdbc:mysql://localhost:3306/db";
			
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection Succesful!!!!");
		}
		catch(Exception e)
		{
			
		}
		return con ;
	}

}
