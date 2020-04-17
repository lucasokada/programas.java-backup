package dao.util;

import java.sql.Connection;

public class ConnectionVerify {

    public static void connectionVerify(Connection connection) {
        try {
            connection = ConnectionConfig.getConnection();

            if (connection != null) {
                System.out.println("connection estabilished");
            }else{
                System.out.println("connection failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
