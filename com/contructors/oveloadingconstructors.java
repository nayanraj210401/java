package com.contructors;

public class oveloadingconstructors {

    public int oveloadingconstructors(int a,int b){


        return (a+b);
    }

   public void oveloadingconstructors (int a, int b, int c){

        c =a+b;
        System.out.println("The sum is "+c);

        return;
    }

    public static void main(String[] args) {

            oveloadingconstructors o = new oveloadingconstructors();


    }





}
