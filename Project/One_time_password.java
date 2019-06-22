package Project;

import java.util.Random;

public class One_time_password {



    static char[] password(int length){

        String Capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small ="abcdefghijklmnopqrstuvwxyz";
        String special = "!@#$%^&*()_-<>";
        String Numbers ="0123456789";

        Random random = new Random();

        String values = Capital+Small+Numbers+special;

        char[] passwords = new char[length];

        System.out.println("The password is :");
        for(int i = 0;i<length;i++){
            passwords[i] = values.charAt(random.nextInt(values.length()));
        }
        return passwords;
    }


    static char[] one_time_pass(int length){

        String numbers ="0123456789";
        String values = numbers;
        Random ran =new Random();
        char[] OTP = new char[length];

        System.out.println("Your OTP is ");
        for(int i=0;i<length;i++){
            OTP[i] = values.charAt(ran.nextInt(values.length()));
        }


        return OTP;
    }

    public static void main(String[] args) {

        int OTP_len = 4;
        int len =10;
        System.out.println(password(len));
        System.out.println(one_time_pass(OTP_len));


    }

}
