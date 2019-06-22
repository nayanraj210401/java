package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DBInsert {

    public static void main(String[] args) throws SQLException {

java.sql.Statement stmt =null;


        System.out.println("Enter id information");
            int id =  (new Scanner(System.in)).nextInt();//you can intiallize for an static input
        System.out.println("Enter name of client");
            String name =(new Scanner(System.in)).nextLine();
        System.out.println("Enter job of the client");
            String job =(new Scanner(System.in)).nextLine();
        System.out.println("Enter salary of the client");
            int sal = (new Scanner(System.in)).nextInt();
        String dbInsert = "insert into Table1 values("+id+",'"+name+"','"+job+"',"+sal+")";
        // my Sql
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectls", "root", "toor");
        System.out.println("Connected");
//        java.sql.Statement stmt = con.createStatement();
        stmt = con.createStatement();
        stmt.executeUpdate(dbInsert);
        System.out.println("Record Inserted");

        // con.close();
    }
}
