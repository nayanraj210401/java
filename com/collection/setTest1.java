package com.collection;
//set interface has 3 classes in major
//hashSet
//LinkedHashSet
//TreeSet
//set to avoid duplicates , set operation are not allowing read by index

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setTest1 {

    public static void main(String[] args) {


        java.util.Set<String> mySet = new HashSet<>();//hashSet is not granrented in oreder of storage
        mySet.add("One");
        mySet.add("Two");
        mySet.add("Three");
        mySet.add("Four");
        mySet.add("Six");
        mySet.forEach(a -> System.out.println(a));

        //TO get the correct order we need to use LinkedHashSet
        System.out.println("  ");
        java.util.Set<String> MySet = new LinkedHashSet<>();//hashSet is not granrented in oreder of storage
        MySet.add("One");
        MySet.add("Two");
        MySet.add("Three");
        MySet.add("Four");
        MySet.add("Six");
        MySet.forEach(a -> System.out.println(a));


        //Tree Set we also get in sorted order but it does not allows null values

        System.out.println("  ");
        java.util.Set<String> MYSet = new TreeSet<>();//hashSet is not granrented in oreder of storage
        MYSet.add("One");
        MYSet.add("Two");
        MYSet.add("Three");
        MYSet.add("Four");
        MYSet.add("Six");
        MYSet.forEach(a-> System.out.println(a));

    }

}
