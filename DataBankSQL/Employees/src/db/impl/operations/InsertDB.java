package db.impl.operations;

import com.br.domain.entities.Employees;
import db.util.CloseConnection;
import db.util.ClosePreparedStatement;
import db.util.ConnectionConfiguration;

import java.sql.*;

public class InsertDB {

    public static void insert(Employees employee)
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try{
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO coursejdbc.employees((name varchar(55), salary double, entryDate date , officeName varchar(55)) VALUES (?,?,?,?))");


            System.out.println("salary:" + employee.getSalary());
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setDouble(2, employee.getSalary());
            preparedStatement.setDate(3, new Date(employee.getEntryDate().getTime()));
            preparedStatement.setString(4, employee.getOffice().returnOfficeName());

            System.out.println("successfully inserted");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        ClosePreparedStatement.closePreparedStatement(preparedStatement);
        CloseConnection.closeConnection(connection);
    }
}
