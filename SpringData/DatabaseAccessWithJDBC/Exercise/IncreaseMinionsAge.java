package SpringData.DatabaseAccessWithJDBCExercise;

import java.sql.*;
import java.util.Scanner;

public class IncreaseMinionsAge {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "");
        String[] minionsIDs = scanner.nextLine().split(" ");
        for (int i = 0; i < minionsIDs.length; i++) {
            PreparedStatement statement = connection.prepareStatement("UPDATE minions SET age = age + 1, name = LOWER(name)\n" +
                    "WHERE id = ?;");
            statement.setInt(1, Integer.parseInt(minionsIDs[i]));
            statement.execute();
        }
        PreparedStatement statement = connection.prepareStatement("SELECT name, age FROM minions;");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + " " + resultSet.getInt(2));
        }
    }
}
