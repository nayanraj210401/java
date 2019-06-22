package com.contructors;

import java.util.Scanner;

public class student {

    private int sl;
    private String name;
    private String course;
    private double cost;

    public student() {

        //This is used when there is no parameters given
//        System.out.println("Enter sln");
//        sl = (new Scanner(System.in)).nextInt();
//        System.out.println("Enter name");
//        name =(new Scanner(System.in)).nextLine();
//        System.out.println("Enter course");
//        course = (new Scanner(System.in)).nextLine();
//        System.out.println("Enter cost");
//        cost = (new Scanner(System.in)).nextInt();

    }


    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public student(int sl, String name, String course, double cost) {
        //This is use when parameters are given in an object
        this.sl = sl;
        this.name = name;
        this.course = course;
        this.cost = cost;
    }


    public static void main(String[] args) {
        student s = new student();
        System.out.println(s.getSl()+" "+s.getName());
        student s2 = new student(102,"human","CSE",200);
        System.out.println(s2.getSl()+ " "+s2.getName() );

    }


}
