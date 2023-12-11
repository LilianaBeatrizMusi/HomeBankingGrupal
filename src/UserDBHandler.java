import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDBHandler {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/banco_java";
    private static final String USER = "root";
    private static final String PASSWORD = "mysql";

    public static List<String> getUsers() {
        List<String> userList = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            String query = "SELECT username FROM users";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                while (resultSet.next()) {
                    String username = resultSet.getString("username");
                    userList.add(username);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userList;
    }
    
    public static boolean authenticateUser(String username, String password) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    // Check if the result set has any rows
                    return resultSet.next();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Authentication failed due to an exception
        }
    }

    public static boolean createUser(String username, String password) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            String query = "INSERT INTO users (username, password) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                preparedStatement.executeUpdate();
                System.out.println("User created successfully.");
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

   /*
   public static void main(String[] args) {
        // Get a list of users
        List<String> users = getUsers();
        System.out.println("List of users: " + users);

        // Create a new user
        createUser("newuser", "password123");
    }
    */
}
