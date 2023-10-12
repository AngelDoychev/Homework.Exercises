package SpringData.DatabaseAccessWithJDBC;

import java.sql.*;

public class connect {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/soft_uni", "root", "");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");
        while (resultSet.next()){
            System.out.println(resultSet.getString(5));
        }
    }
}
