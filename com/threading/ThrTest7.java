package com.threading;

public class ThrTest7 extends Thread{

    @Override
    public void run() {
        try{
            for(int i = 1;i<=5;i++){
                sleep(1000);
                if(i<=5){
                    System.out.println(i);
                }
                else {
                    interrupt();
                }

            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new ThrTest7().start();
    }
}

