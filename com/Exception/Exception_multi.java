package com.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_multi {
    public static void main(String[] args) {


        try
        {
            System.out.println("numerator");
            int n = (new Scanner(System.in)).nextInt();
            System.out.println("denominator");
            int m = (new Scanner(System.in)).nextInt();
            int p = n / m;
            System.out.println("quentient =" + p);

        }
        /*catch(ArithmeticException e ) {//this exception gives an error in the case of Arthematic
            System.out.println(e.getMessage());
            System.out.println("denominator cannot be divided with zero");

        }
        catch(java.lang.Exception h) {//this gives an error for other types of exception
            System.out.println(h);
        }*/

        // piping method
        catch(ArithmeticException | InputMismatchException e){
            if(e instanceof ArithmeticException){
                System.out.println("Denominator cannot be divided by 0");
            }
            else if(e instanceof InputMismatchException){
                System.out.println("Expected an Integer");
            }
        }
        finally {//The conclusion is decided here
            System.out.println("END OF PROGRAM");
        }


    }

}
