package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//IN this we are going to retrive the data

public class DBview {

    public static void main(String[] args) throws SQLException {




        String db = "insert into Table1 values(?,?,?,?)" ;
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectls", "root", "toor");
        System.out.println("Connected");
//        java.sql.Statement stmt = con.createStatement();
        java.sql.Statement stm =conn.createStatement();
        java.sql.ResultSet resultSet = stm.executeQuery("select * from Table1");
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2));
        }
//        resultSet.close();
//        conn.close();


    }


}
