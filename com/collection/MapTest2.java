package com.collection;

import java.util.*;

public class MapTest2 {// In this we are reading the row which makes the reading the set faster.
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(222,"India");
        map.put(223,"Japan");
        map.put(224,"Info");

        Set mySet = map.entrySet();
        Iterator <Map.Entry<Integer,String>> itr =mySet.iterator();
        while(itr.hasNext()){
            Map.Entry row = itr.next();
            System.out.println("Key = "+row.getKey()+"Value ="+row.getValue());
        }
        java.util.List<String> list = new ArrayList<>();
        list.addAll(map.values());
        System.out.println(list.size());
        System.out.println(list);


    }//Map is an 2D collection of data and Set is 1D collection of data
}
