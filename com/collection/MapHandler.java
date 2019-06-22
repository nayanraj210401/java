package com.collection;

import java.util.*;

/*Map ---> stores data in key value pair
put(key,value)
get(key)
set(key,value)
ketSet()
entrySet()
remove()
k | v
k1| v1 --> Entry
* */
public class MapHandler {



    public static void main(String[] args) {
        //HashMap<Integer,String> map =new HashMap<>();
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
       // TreeMap<Integer,String> map = new TreeMap<>();
        map.put(221,"no1");
        map.put(222,"no2");
        map.put(223,"India");
        map.put(226,"Japan");
        System.out.println("No of Entries ="+map.size() );
        //Iterable<Integer> itr = map.keySet().iterator();
        Set<Integer> set = map.keySet();
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()){

            int key =itr.next();
            System.out.println(key+" "+map.get(key));
        }

    }


}
