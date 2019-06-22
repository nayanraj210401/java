package com.collection;

public class Person implements Comparable<Person> {

    private int Id;
    private String name;
    private String Job;

    public Person(int id, String name, String job) {
        Id = id;
        this.name = name;
        Job = job;
    }


    public Person(){

    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

   @Override
    public int compareTo(Person p) {
        if(this.getId()==p.getId())return 0;
        else if(this.getId() > p.getId()) return 1;
        else return -1;
    }
}
