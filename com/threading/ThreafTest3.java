package com.threading;

public class ThreafTest3 implements Runnable{//THis is an interface


    @Override
    public void run() {
        System.out.println("Runnable Interface called");
    }

    public static void main(String[] args) {
        ThreafTest3 test3  = new ThreafTest3();//Instance for the runnble

        Thread thread = new Thread(test3);//Register the runnable into thread class
        thread.start();


        //using lambda function
        Runnable r=()->{
            for (int i =1;i<10;i++){
                System.out.println(i);
            }
        };

        Thread t1 = new Thread(r);
        t1.start();

    }


}
