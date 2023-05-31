import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Mydb {
	public static void main(String[] args) {

		try {
			Connection con = DriverManager.getConnection("", "root", "root");
			Statement smt = con.createStatement();
			String s = "";
			smt.execute(s);
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
