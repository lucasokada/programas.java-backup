package dao.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    public static void createTable()
    {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = ConnectionConfig.getConnection();
            statement = connection.createStatement();
            statement.execute("create table if not exists coursejdbc.test(id INT NOT NULL AUTO_INCREMENT)");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}