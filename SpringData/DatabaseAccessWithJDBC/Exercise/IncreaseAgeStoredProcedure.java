package SpringData.DatabaseAccessWithJDBCExercise;

import java.sql.*;
import java.util.Scanner;

public class IncreaseAgeStoredProcedure {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "");
        int minionID = Integer.parseInt(scanner.nextLine());
        //DELIMITER ###
        //CREATE PROCEDURE usp_get_older(minion_id INT)
        //BEGIN
        //UPDATE minions SET age = age + 1
        //WHERE id = minion_id;
        //END ###
        //DELIMITER ;
            PreparedStatement statement = connection.prepareStatement("CALL usp_get_older(?)");
            statement.setInt(1, minionID);
            statement.execute();
        statement = connection.prepareStatement("SELECT name, age FROM minions " +
                "WHERE id = ?;");
        statement.setInt(1, minionID);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + " " + resultSet.getInt(2));
        }
    }
}
