package com.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBtest {
    public static void main(String[] args) throws SQLException {

//        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/","root","toor");
//        System.out.println("Database Connected");

        // my Sql
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectls","root","toor");
        System.out.println("Connected ");
        con.close();

    }

    }


