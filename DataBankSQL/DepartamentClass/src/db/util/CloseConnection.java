package db.util;

import java.sql.Connection;
import java.sql.SQLException;

public class CloseConnection {

    public static void closeConnection(Connection connection)
    {
        if(connection != null){
            try{
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
