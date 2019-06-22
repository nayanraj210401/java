package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTableTest {


    public static void main(String[] args) throws SQLException {

        String dbTable ="create table table1(empid int primary key, ename varchar(20),"+"job varchar(20),sal int)";

        // my Sql
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectls","root","toor");
        System.out.println("Connected ");
        java.sql.Statement stmt = con.createStatement();
        stmt.execute(dbTable);
        System.out.println("table created");
       // con.close();




    }


}
