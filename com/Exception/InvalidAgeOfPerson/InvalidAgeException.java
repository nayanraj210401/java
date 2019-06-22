package com.Exception.InvalidAgeOfPerson;

public class InvalidAgeException extends RuntimeException {//unchecked Exception

    public InvalidAgeException(){
        super("Age Exception is not found");
    }

    public InvalidAgeException(String message){
        super(message);
    }


}
