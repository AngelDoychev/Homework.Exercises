package SpringData.DatabaseAccessWithJDBCExercise;

import java.sql.*;
import java.util.Scanner;

public class AddMinion {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        String[] minionInput = scanner.nextLine().split(" ");
        String[] villainInput = scanner.nextLine().split(" ");
        String minionName = minionInput[1];
        int townID = 0;
        int villainID = 0;
        int minionAge = Integer.parseInt(minionInput[2]);
        String villainName = villainInput[1];
        String townName = minionInput[3];
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "");
        PreparedStatement statement = connection.prepareStatement("SELECT name FROM towns WHERE name = ?");
        statement.setString(1, minionName);
        ResultSet resultSet = statement.executeQuery();
        if (!resultSet.next()){
            statement = connection.prepareStatement("INSERT INTO towns (name) VALUES (?);");
            statement.setString(1, minionName);
            statement.execute();
            System.out.printf("Town %s was added to the database.%n", townName);
            statement = connection.prepareStatement("SELECT id FROM towns Where name = ?");
            statement.setString(1, townName);
            resultSet = statement.executeQuery();
            townID = resultSet.getInt(1);
        }
        statement = connection.prepareStatement("SELECT name FROM villains WHERE name = ?");
        statement.setString(1, minionName);
        resultSet = statement.executeQuery();
        if (!resultSet.next()){
            statement = connection.prepareStatement("INSERT INTO villains (name) VALUES (?);");
            statement.setString(1, minionName);
            statement.execute();
            System.out.printf("Villain %s was added to the database.%n", villainName);
            statement = connection.prepareStatement("SELECT id FROM villains Where name = ?");
            statement.setString(1, villainName);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                villainID = resultSet.getInt(1);
            }
        }
        statement = connection.prepareStatement("SELECT name FROM minions WHERE name = ?");
        statement.setString(1, minionName);
        resultSet = statement.executeQuery();

        if (!resultSet.next()){
            statement = connection.prepareStatement("INSERT INTO minions (name, age, town_id) VALUES (?, ?, ?);");
            statement.setString(1, minionName);
            statement.setInt(2, minionAge);
            statement.setInt(3, townID);
            statement.execute();
            int minionID = 0;
            statement = connection.prepareStatement("SELECT id FROM minions WHERE name = ?;");
            statement.setString(1, minionName);
            resultSet = statement.executeQuery();
            minionID = resultSet.getInt(1);

            statement = connection.prepareStatement("SELECT id FROM villains WHERE name = ?;");
            statement.setString(1, villainName);
            resultSet = statement.executeQuery();
            villainID = resultSet.getInt(1);
            statement = connection.prepareStatement("INSERT INTO minions_villains (minion_id, villain_id) VALUES (?, ?);");
            statement.setInt(1, minionID);
            statement.setInt(1, villainID);
            statement.execute();
            System.out.printf("Successfully added %s to be minion of %s.%n", minionName, villainName);
        }
    }
}
