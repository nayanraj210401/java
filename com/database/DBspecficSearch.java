package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBspecficSearch {
    public static void main(String[] args) throws SQLException {
        java.sql.PreparedStatement stmt = null;




        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectls", "root", "toor");
        System.out.println("Connected");
        java.sql.Statement stm =conn.createStatement();
        java.sql.ResultSet resultSet = stm.executeQuery("select * from Table1 where job ='Clark'");//THis is used to search the job
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2));
        }
//        resultSet.close();
//        conn.close();


    }
}
