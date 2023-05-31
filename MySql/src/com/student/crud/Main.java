package com.student.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/db";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] args) throws ClassNotFoundException {
    	
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            Scanner scanner = new Scanner(System.in);
            String choice;
            
            do {
                System.out.println("--- CRUD Operations ---");
                System.out.println("1. Create record");
                System.out.println("2. Read records");
                System.out.println("3. Update record");
                System.out.println("4. Delete record");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        CreateOperation.createRecord(connection, scanner);
                        break;
                    case "2":
                        ReadOperation.readRecords(connection);
                        break;
                    case "3":
                        UpdateOperation.updateRecord(connection, scanner);
                        break;
                    case "4":
                        DeleteOperation.deleteRecord(connection, scanner);
                        break;
                    case "0":
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
                System.out.println();
            } while (!choice.equals("0"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
