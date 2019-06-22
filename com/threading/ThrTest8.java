package com.threading;

class interviwer{
    public synchronized void call(String person){
        try{
            System.out.println("Interview in progress :"+person);
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Waiting for next person/...");
    }
}


public class ThrTest8 extends Thread  {

    interviwer intr;
    String candidate;


    public ThrTest8(interviwer intr , String candidate){
        this.intr = intr;
        this.candidate = candidate;
        start();
    }

    public void run(){
     intr.call(candidate);
    }


    public static void main(String[] args) {

        interviwer intr = new interviwer();
        ThrTest8 thrTest8 = new ThrTest8(intr,"Raju");
        ThrTest8 p2 = new ThrTest8(intr,"jaya");
    }

}
