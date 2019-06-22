package com.Exception;

public class Exception4 {


    public static void validationUsername(String username) throws java.lang.Exception {
        if(username.length() < 5){
            throw (new java.lang.Exception("Invalid length"));
        }
        else{
            System.out.println("Valid username");
        }


    }

    public static void main(String[] args) {

        try{//using try catch to avoid an error in the below function
            Exception4.validationUsername("name");
        }catch (java.lang.Exception e){
            System.out.println(e);
        }

    }

}
