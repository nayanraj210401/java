package com.collection;

import java.util.StringTokenizer;

public class strToken {

    public static void main(String[] args) {

        String text ="THis is an Token Test";
        StringTokenizer tokens = new StringTokenizer(text," ");//This StringTokenizer is ued to give a specific String word at a time
        System.out.println("Number of tokens = "+tokens.countTokens());
        while (tokens.hasMoreTokens())//Gives us an null if No more String present
        {
            String t = tokens.nextToken();//Storing each string of tokens in t
            System.out.println(t);
        }

    }

}
