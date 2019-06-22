package com.arrays;

import java.util.Scanner;

public class array2d {

    public static void main(String[] args) {

        int[][] arr = new int[2][2];

        int rows = arr.length;
        int col = arr[0].length;
        System.out.println("Enter the elements");

        for(int i = 0 ; i<rows;i++) {

            for(int j =0; j<col;j++){

                arr[i][j] = (new Scanner(System.in)).nextInt();
            }

        }

        //Reading 2d array
        for(int row[] : arr){
            for(int c : row){
                System.out.print(c+" ");
            }

            System.out.println(" ");
        }


        System.out.println("                            " +
                "               ");

        for(int i = 0 ;i<arr.length;i++){
            for(int j =0 ;j<arr[i].length;j++){//where row is length of 1 st line

                System.out.print(arr[i][j]+ " ");
            }
            System.out.println(" ");
        }

        /* first the row 1 is taken and that is[1,2] in [1,2][3,4]*/


    }

}
