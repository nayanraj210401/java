package com.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Excutors {

    //Runable is use to call the by execute()

    public static void main(String[] args) {
        ExecutorService exe = Executors.newCachedThreadPool();
        System.out.println(exe);
        Runnable r=()->{
          for(int i =1;i<=15;i++){
              System.out.println(i);
          }

        };
            exe.execute(r);//this take an runnable;

    }




}
