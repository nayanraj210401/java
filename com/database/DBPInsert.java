package com.database;
//We are using PreaparedStatement in this Example

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
//PreparedStaement is faster than Statement
public class DBPInsert {


    public static void main(String[] args) throws SQLException {
        java.sql.PreparedStatement stm = null;

        int id1 =  (new Scanner(System.in)).nextInt();

        String name1 =(new Scanner(System.in)).nextLine();

        String job1 =(new Scanner(System.in)).nextLine();

        int sal1 = (new Scanner(System.in)).nextInt();

        String db = "insert into Table1 values(?,?,?,?)" ;
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectls", "root", "toor");
        System.out.println("Connected");
//        java.sql.Statement stmt = con.createStatement();
        stm = con.prepareStatement(db);
        stm.setInt(1,id1);
        stm.setString(2,name1);
        stm.setString(3,job1);
        stm.setInt(4,sal1);
        stm.executeUpdate();

        System.out.println("Record Inserted");


    }

}
