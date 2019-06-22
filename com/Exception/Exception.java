package com.Exception;

import java.util.Scanner;

public class Exception {

    public static void main(String[] args) {
        try {
            System.out.println("Numerator");
            int n = (new Scanner(System.in)).nextInt();
            System.out.println("Denominator");
            int m = (new Scanner(System.in)).nextInt();
            int p = n / m;
            System.out.println("Quentient =" + p);

        }catch (java.lang.Exception e){//Catches the error and prints it
            System.out.println(e);
        }
        finally {
            System.out.println("END OF PROGRAM");
        }
        }


}
