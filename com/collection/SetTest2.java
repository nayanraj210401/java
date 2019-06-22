package com.collection;

import java.util.TreeSet;



public class SetTest2 {

    public static void main(String[] args) {

        TreeSet<Person> persons = new TreeSet<>();
        persons.add(new Person(101,"Human1","Clark"));
        persons.add(new Person(102,"Human2","manager"));
        persons.add(new Person(103,"human","waiter"));
        persons.add(new Person(104,"Human4","Software developer"));
       persons.forEach(a-> System.out.println(a));
       persons.forEach(a-> System.out.println(a.getId()+" "+a.getName()+" "+a.getJob()));


       //Other way
        System.out.println("Stream output");
        persons.stream().filter(p->p.getName().contains("H")).forEach(p-> System.out.println(p.getName()+" "+p.getId()));

//        System.out.println("No of records having  :"+persons.stream().filter(p->p.getName().contains("H")).count());
//        Person p = persons.stream().max(p1,p2)->p1.getId()>p2.getid()?1:-1).get();
//        System.out.println(p.getName());


    }

}
