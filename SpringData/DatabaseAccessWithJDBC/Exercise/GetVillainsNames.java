package SpringData.DatabaseAccessWithJDBCExercise;

import java.sql.*;

public class GetVillainsNames {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT v.name, COUNT(DISTINCT minion_id) AS minions_count FROM minions_villains AS mv " +
                "JOIN villains AS v " +
                "ON mv.villain_id = v.id " +
                "GROUP BY v.id " +
                "HAVING minions_count > 15;");
        ;
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
        }
    }
}
