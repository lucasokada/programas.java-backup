package db.impl.operations;

import db.util.CloseConnection;
import db.util.CloseStatement;
import db.util.ConnectionConfiguration;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTableCreate {

    public static void createTable()
    {
        Connection connection = null;
        Statement statement = null;

        try{
            connection = ConnectionConfiguration.getConnection();
            statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS coursejdbc.employees(name varchar(55), salary double, entryDate DATE , officeName varchar(55))");

        } catch (SQLException e) {
            e.printStackTrace();

        }finally{
            CloseStatement.closeStatment(statement);
            CloseConnection.closeConnection(connection);
        }
    }
}
