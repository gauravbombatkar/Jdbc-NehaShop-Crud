package com.student.crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CreateOperation {
    public static void createRecord(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        String age = scanner.nextLine();

        String sql = "INSERT INTO customers (name, age) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, name);
            statement.setString(2, age);

            int rowsInserted = statement.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted.");
        }
    }
}
