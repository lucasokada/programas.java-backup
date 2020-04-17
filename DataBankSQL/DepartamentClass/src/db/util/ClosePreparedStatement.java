package db.util;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClosePreparedStatement {

    public static void closePreparedStatement(PreparedStatement preparedStatement)
    {
        if(preparedStatement != null){
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
