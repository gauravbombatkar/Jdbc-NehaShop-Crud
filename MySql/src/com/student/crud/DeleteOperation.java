package com.student.crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteOperation {
    public static void deleteRecord(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter ID of the record to delete: ");
        int idToDelete = Integer.parseInt(scanner.nextLine());

        String sql = "DELETE FROM customers WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, idToDelete);

            int rowsDeleted = statement.executeUpdate();
            System.out.println(rowsDeleted + " row(s) deleted.");
        }
    }
}
