package com.threading;

//This is an Heavy weight model that is using thread instance of Runnable instance as Thread is an heavyWeight model as this use to handle heavy things
//In the case of lightweight model we use the runnable instance in which the Main server is divided into subServers which helps in Accsessing the data faster.

class Fruits extends Thread{

    @Override
    public void run() {
        String fruits[] = {"apple","grapes","orange","watermelon"};
        for (String f:fruits){
            System.out.println(f);
        }
    }
}

class Flower extends Thread{

    @Override
    public void run() {
       try{
           String Flower[] = {"rose","lilly","RedRose","watermelon"};
           for (String f:Flower){
               sleep(2000);
               System.out.println(f);
           }
       }catch (Exception e){
           e.getMessage();
       }
    }
}

public class ThreadTest2 {


    public static void main(String[] args) {

        Fruits fh = new Fruits();
        Flower flower = new Flower();
        flower.start();
        fh.start();

    }

}
