package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

//generic implementation supports type safety of data. <> are used to generic delclaration
public class listTest2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        ArrayList<String> fruits = new ArrayList<>();
        list.add("grapes");
        list.add("Watermelon");
       fruits.addAll(0,list);
       // fruits.forEach(a-> System.out.println(a));// this is used to print the fruits by lamda function



        Iterator<String> itr =  fruits.iterator();
        while(itr.hasNext()){//hasNext()is used to check whether the next element is present or not if not then gives us an numm
            System.out.println(itr.next());//The function next is used to show
        }

    }

}
