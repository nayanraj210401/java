package com.threading;

public class ThreadTest1  extends  Thread{

    @Override
    public void run() {
        for(int i =1;i<=10;i++){
            System.out.println("Thread = "+i);
        }
    }

    public static void main(String[] args) {

        ThreadTest1 thread = new ThreadTest1();
            thread.start();


    }


}
