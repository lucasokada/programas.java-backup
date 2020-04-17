package db.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionConfiguration {

    public static Connection getConnection()
    {
        String sqlDriver = "com.mysql.jdbc.Driver";
        String local = "jdbc:mysql://localhost:3306/coursejdbc?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "Info@1234";
        Connection connection = null;

        try{
            Class.forName(sqlDriver);
            connection = DriverManager.getConnection(local, user, password);

        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
