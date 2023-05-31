package com.shop.neha;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NehaDao {
	public static boolean insertNehaToDb(Neha n)
	{
		boolean f = false ;
		try {
			// jdbc connection
			Connection con = CP.createC();
			System.out.println(con);
			String q = "insert into neha(name,number,totolBill) values (?,?,?)";
			
			//prepared statement
			PreparedStatement pstmt  = con.prepareStatement(q);
			pstmt.setString(1, n.getName());
			pstmt.setString(2, n.getNumber());
			pstmt.setString(3, n.getTotalBill());
			
			//execution
			int s = pstmt.executeUpdate();
			System.out.println("execute" + s);
			f = true ;
		}
		
		catch(SQLException e ) {
			e.printStackTrace();
			
		}
		
		return f ;
	}

}
