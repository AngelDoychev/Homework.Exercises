package SpringData.DatabaseAccessWithJDBCExercise;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class PrintAllMinionNames {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "");
        PreparedStatement statement = connection.prepareStatement("SELECT name FROM minions;");
        ResultSet resultSet = statement.executeQuery();
        List<String> list = new ArrayList<>();
        while (resultSet.next()) {
            list.add(resultSet.getString(1));
        }
        int first = 0;
        int last = list.size() - 1;
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(list.get(first++));
            } else {
                System.out.println(list.get(last--));
            }
        }
    }
}
