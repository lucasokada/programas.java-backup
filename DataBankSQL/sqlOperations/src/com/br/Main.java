package com.br;

import dao.util.ConnectionConfig;
import dao.util.ConnectionVerify;
import dao.util.CreateTable;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        Connection connection = ConnectionConfig.getConnection();
        ConnectionVerify.connectionVerify(connection);

        CreateTable.createTable();
    }
}
