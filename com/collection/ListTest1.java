package com.collection;

import java.util.ArrayList;

public class ListTest1 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20.5);
        list.add("India");
        System.out.println(list);
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
        list.add(1,"Test");
        list.add(20);
        list.add(null);
        list.remove(list.size()-1);
        System.out.println(list);
        }

    }

