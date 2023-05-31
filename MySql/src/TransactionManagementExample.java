import java.sql.*;

public class TransactionManagementExample {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void performTransaction(String borrowerId, String bookId) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Set auto-commit to false to start a transaction
            connection.setAutoCommit(false);

            // Check if the book is available
            if (isBookAvailable(connection, bookId)) {
                // Update book status to 'Checked Out'
                updateBookStatus(connection, bookId, "Checked Out");

                // Insert a new transaction record
                insertTransaction(connection, borrowerId, bookId);

                System.out.println("Transaction completed successfully.");
                
                // Commit the transaction
                connection.commit();
            } else {
                System.out.println("Book is not available for checkout.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Rollback the transaction in case of any exception
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } finally {
            // Restore auto-commit to true
            if (connection != null) {
                try {
                    connection.setAutoCommit(true);
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static boolean isBookAvailable(Connection connection, String bookId) throws SQLException {
        String query = "SELECT status FROM books WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, bookId);
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next() && resultSet.getString("status").equals("Available");
            }
        }
    }

    private static void updateBookStatus(Connection connection, String bookId, String status) throws SQLException {
        String query = "UPDATE books SET status = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, status);
            statement.setString(2, bookId);
            statement.executeUpdate();
        }
    }

    private static void insertTransaction(Connection connection, String borrowerId, String bookId) throws SQLException {
        String query = "INSERT INTO transactions (borrower_id, book_id, transaction_date) VALUES (?, ?, NOW())";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, borrowerId);
            statement.setString(2, bookId);
            statement.executeUpdate();
        }
    }

    public static void main(String[] args) {
        String borrowerId = "B001";
        String bookId = "B001";

        performTransaction(borrowerId, bookId);
    }
}
