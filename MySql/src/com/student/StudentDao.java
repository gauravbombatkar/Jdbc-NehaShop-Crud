package com.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {

	public static boolean insertStudentToDb(Student st) {
		boolean f = false;

		try {
			// jdbc conection
			Connection con = Cp.createC();
			System.out.println(con);
			String q = "insert into students(name,phone,city) values(?,?,?)";
			
			// Prepread Statement
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());

			// execute
			int s = pstmt.executeUpdate();//1 
			System.out.println("execute" + s);
			f = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return f;
	}
}
