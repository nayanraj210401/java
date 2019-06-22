package com.arrays;

import java.util.Scanner;

public class joggedArrays {

    public static void main(String[] args) {

        int arr[][] = new int[3][];

        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[3];

//        for(int i =0;i<arr.length;i++)
//        {
//            arr[i] = new int[i+1];//gives us the column
//        }
       System.out.println("Enter Values");
        for(int i=0;i<arr.length;i++)
        {
            for(int j =0;j<arr[i].length;j++)
            {
                arr[i][j] = (new Scanner(System.in)).nextInt();

            }
        }

        //display elements
        for(int rows[] : arr){
            for(int c : rows){
                System.out.print(c+" ");
            }
            System.out.println(" ");
        }



    }

}
