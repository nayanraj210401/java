package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class tester {

    public static void main(String[] args) {

        tester t = new tester();
        t.createConnection();

    }

    void createConnection(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectls","root","toor");
            System.out.println("Connected to my sql");
        }catch (ClassNotFoundException ex ){
            System.out.println(ex);

        }
        catch (SQLException sq){
            System.out.println(sq);
        }


    }



}
