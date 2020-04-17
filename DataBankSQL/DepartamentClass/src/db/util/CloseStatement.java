package db.util;

import java.sql.SQLException;
import java.sql.Statement;

public class CloseStatement {

    public static void closeStatment(Statement statement)
    {
        if(statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
