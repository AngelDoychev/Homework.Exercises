package SpringData.DatabaseAccessWithJDBCExercise;

import java.sql.*;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class ChangeTownNameCasing {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "");
        String country = scanner.nextLine();
        PreparedStatement statement = connection.prepareStatement("UPDATE towns SET name = UPPER(name)\n" +
                "WHERE country = ?;");
        statement.setString(1, country);
        statement.execute();
        int affected = statement.getUpdateCount();
        if (affected == 0){
            System.out.println("No town names were affected.");
            return;
        }
        statement = connection.prepareStatement("SELECT name FROM towns " +
                "WHERE country = ?;");
        statement.setString(1, country);
        ResultSet resultSet = statement.executeQuery();
        Set set = new LinkedHashSet();
        while (resultSet.next()) {
           set.add(resultSet.getString(1));
        }
        System.out.printf("%d town names were affected.%n", affected);
        System.out.println("[" + String.join(", ", set) + "]");
    }
}
