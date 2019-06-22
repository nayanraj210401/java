package com.Exception.InvalidAgeOfPerson;

public class ExceptionTest_file {

 public static void checkAge(int Age) throws InvalidAgeException{
     if(Age<18){
         throw (new InvalidAgeException("Mininum age is 18"));
     }
     else
     {
         System.out.println("Valid Age");
     }
 }

    public static void main(String[] args) {
        ExceptionTest_file.checkAge(22);
    }
}
