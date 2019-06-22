package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DBTable1 {


    public static void main(String[] args) throws SQLException {
        java.sql.PreparedStatement stmt = null;

        //Connecting to mySQL
        String db = "insert into Table1 values(?,?,?,?)" ;
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectls", "root", "toor");
        System.out.println("Connected to mySQL database");
        System.out.println("Operations");
        System.out.println("1.Insert values");
        System.out.println("2.Delete values");
        System.out.println("3.Show database");
        int ch = (new Scanner(System.in)).nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter Id");
                int id = (new Scanner(System.in)).nextInt();
                System.out.println("Enter Name");
                String name = (new Scanner(System.in)).nextLine();
                System.out.println("Enter workType of client");
                String work = (new Scanner(System.in)).nextLine();
                System.out.println("Enter Salary fo the client");
                int sal = (new Scanner(System.in)).nextInt();
              stmt.setInt(1,id);
              stmt.setString(2,name);
              stmt.setString(3,work);
              stmt.setInt(4,sal);
              stmt.executeUpdate();
                System.out.println("Recored values");
                break;
            case 2:
               java.sql.Statement st1 =con.createStatement();
                System.out.println("Enter the name want to delete");
                int name1 = (new Scanner(System.in)).nextInt();
               int result =st1.executeUpdate("DELETE FROM TABLE1 WHERE empid ="+name1);
                System.out.println("Deleted ");

                break;
            case 3:
                java.sql.Statement stm = con.createStatement();
                java.sql.ResultSet resultSet = stm.executeQuery("SELECT * FROM TABLE1");
                while(resultSet.next()){
                    System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2));
                }
                break;
                default:
                    System.out.println("Error");
        }


    }


}
