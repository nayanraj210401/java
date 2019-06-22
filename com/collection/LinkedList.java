package com.collection;
//Lisked list is used for stack and queue
/* methods of Linked list
*
* addFirst(obj)   getFirst()
* addLast(obj)     getlast()
* removeFirst()   push(obj)
* removeLast()     pop()
*
* */
public class LinkedList {
    public static void main(String[] args) {

        java.util.LinkedList<Integer> list = new java.util.LinkedList<>();
        list.push(10);
        list.push(20);
        System.out.println(list);
        list.pop();
        System.out.println(list);
        list.pop();
        System.out.println(list);
//        list.pop();
//        System.out.println(list);
//
        for(int i=10;i<=100;i+=10){
            list.add(i);
        }
        list.forEach(System.out::println);

        for(int n =0;n<list.size();n++){
            System.out.println(list);
            list.removeFirst();
        }


    }
}
