package com.student;

import java.sql.Connection;
import java.sql.DriverManager;

public class Cp {
	
	static Connection con;
	
	public static Connection createC() {
		
		try {
			
			//load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the connection
			
			String user = "root";
			String pass = "root";
			String url = "jdbc:mysql://localhost:3306/db";
			
			con = DriverManager.getConnection(url,user,pass);
			System.out.println("Connection Succusful!!!!!!");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return con;
		
	}

	

}
