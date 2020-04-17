package db.impl;

import db.util.ConnectionConfiguration;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnectionVerify {

    public static void verifyConnectionDb()
    {
        Connection connection = null;

        try{
            connection = ConnectionConfiguration.getConnection();

            if(connection != null){
                System.out.println("Connection established");
            }else{
                System.out.println("Connection failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(connection != null){
                try{
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
