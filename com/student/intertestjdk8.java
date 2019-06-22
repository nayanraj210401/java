package com.student;

@FunctionalInterface
interface  Calculate{
    int calcualate(int a,int b);

    //in the case of FunctionInterface we need to have only one abtract method
    default void h1(){
        System.out.println("This isthe default fuction interface");
    }

    //Interface also support static methods
        static void hello()
        {
            System.out.println("Static method in interface");
        }

}



public class intertestjdk8  {

    public static void main(String[] args) {

        Calculate cal = (x,y)->{return (x+y);};//lambda Expression
        System.out.println(cal.calcualate(12,13));


      cal = (x,y)->{return (x*y);};
        System.out.println(cal.calcualate(12,13));
       cal.h1();
        Calculate.hello();

    }



}
