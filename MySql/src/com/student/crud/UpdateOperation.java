package com.student.crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateOperation {
    public static void updateRecord(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter ID of the record to update: ");
        int idToUpdate = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter new name: ");
        String updatedName = scanner.nextLine();
        System.out.print("Enter new age: ");
        String updatedAge = scanner.nextLine();

        String sql = "UPDATE customers SET name = ?, age = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, updatedName);
            statement.setString(2, updatedAge);
            statement.setInt(3, idToUpdate);

            int rowsUpdated = statement.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated.");
        }
    }
}
