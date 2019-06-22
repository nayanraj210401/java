package com.Exception;

public class Exception3 {
    public static void main(String[] args) {
        try {
            for (int i = 1; i <= 10; i++) {
                if(i<=5){
                    System.out.println("i="+i);
                }
                else
                {
                    throw (new RuntimeException("Interrupted"));//WE can also use break and return
                }


            }
            System.out.println("END OF LOOP");



        } catch (java.lang.Exception e) {
            System.out.println(e);
        }
    }

}
