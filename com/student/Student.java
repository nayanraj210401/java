package com.student;

public class Student {

private int slno;
private String name;

    public int getSlno() {
        return slno;
    }

    public void setSlno(int slno) {
        this.slno = slno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public Student(int slno, String name) {
        this.slno = slno;
        this.name = name;
    }
}
