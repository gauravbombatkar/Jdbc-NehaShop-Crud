package com.student.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReadOperation {
	public static void readRecords(Connection connection) throws SQLException {

		String sql = "SELECT * FROM customers";
		try (PreparedStatement statement = connection.prepareStatement(sql);
				ResultSet resultSet = statement.executeQuery()) {
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String age = resultSet.getString("age");
				System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);

			}
			System.out.println();
		}
	}
}
