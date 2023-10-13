package SpringData.DatabaseAccessWithJDBCExercise;

import java.sql.*;
import java.util.Scanner;

public class GetMinionNames {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "");
        PreparedStatement statement = connection.prepareStatement("SELECT m.name, m.age, v.name FROM minions_villains AS mv\n" +
                "JOIN minions AS m\n" +
                "ON mv.minion_id = m.id\n" +
                "JOIN villains AS v\n" +
                "ON mv.villain_id = v.id\n" +
                "WHERE villain_id = ?;");
        int id = Integer.parseInt(scanner.nextLine());
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        int count = 1;
        while (resultSet.next()) {
            if (count == 1) {
                System.out.println("Villain: " + resultSet.getString(3));
            }
            System.out.println(count++ + ". " + resultSet.getString(1) + " " + resultSet.getString(2));
        }
    }
}
