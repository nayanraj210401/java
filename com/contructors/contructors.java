package com.contructors;

public class contructors {

        int x,y; //instance variable
    public contructors(){
        x =10;
        y =30;
        System.out.println("Objects is ready");
    }

    public void show(){
        System.out.println(x+","+y);
    }

    public static void main(String[] args) {

        contructors cos = new contructors();
        cos.show();

    }



}
