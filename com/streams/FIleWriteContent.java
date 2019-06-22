package com.streams;

import java.io.FileWriter;

public class FIleWriteContent {


    public static void main(String[] args) throws Exception {

        FileWriter fw  = new FileWriter("D://myfile.txt",true);
        String mytext = "Message for File from java";
        fw.write(mytext);
        fw.close();
        System.out.println("FIle is written");


    }

}
