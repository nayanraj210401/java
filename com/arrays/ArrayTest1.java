package com.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest1 {

    public static void main(String[] args) {

        int[] arr = {13,45,67,67,23,3,49};
        System.out.println("LEngth"+arr.length);

        Arrays.sort(arr);
        for(int n : arr){
            System.out.print("  "+n);
        }


        int[] arr1 = new int[4];
        for(int i = 0 ;i<arr1.length;i++){//by using this loops we can manupulate data
            arr1[i] = (new Scanner(System.in)).nextInt();
        }

       for(int b : arr1){
           System.out.println(b);
       }

    }

}
