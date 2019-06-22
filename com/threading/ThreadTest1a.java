package com.threading;

public class ThreadTest1a extends Thread{

    public ThreadTest1a(String name ) {
        setName(name);
        start();
    }

    @Override
    public void run() {

        try{
            String color[] = {"blue","red","yellow","blueAccent"};
            for(String colors :color){
                sleep(1000);
                System.out.println(getName()+">>"+colors);
            }
        }catch (Exception e){
            e.getMessage();
        }


    }

    public static void main(String[] args) {
        ThreadTest1a t1 = new ThreadTest1a("First");
        ThreadTest1a t2 = new ThreadTest1a("Second");
    }

}
