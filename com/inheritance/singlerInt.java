package com.inheritance;

public class singlerInt {

    public static void main(String[] args) {

        Second s = new Second();
        s.setValues(12,13,14);//here 12,13 are acquired from parent and 14 is from child
        s.showValues();

    }
}
