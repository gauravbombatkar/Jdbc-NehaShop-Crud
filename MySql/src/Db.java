import java.sql.Connection;
import java.sql.DriverManager;

public class Db {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            String url = "jdbc:mysql://localhost:3306/db";
            String username = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established");
            if (con.isClosed()) {
                System.out.println("Connection closed");
            } else {
                System.out.println("Connection Created");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
