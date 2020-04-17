package db.impl.operations;

import db.util.CloseConnection;
import db.util.ClosePreparedStatement;
import db.util.ConnectionConfiguration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDB {

    public static void delete(String name)
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try{
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement("DELETE FROM coursejdbc.employees WHERE name = ?");
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();

            System.out.println("successfully deleted");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        ClosePreparedStatement.closePreparedStatement(preparedStatement);
        CloseConnection.closeConnection(connection);
    }
}
