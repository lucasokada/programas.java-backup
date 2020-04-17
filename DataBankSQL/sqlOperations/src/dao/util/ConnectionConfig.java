package dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionConfig {

    public static Connection getConnection()
    {
        Connection connection = null;
        String complex = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/coursejdbc?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "Info@1234";

        try{
            Class.forName(complex);
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
