package com.streams;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReadContent {

    public static void main(String[] args ) throws Exception {
        FileReader fr = new FileReader("D://myfile.txt");

        BufferedReader br = new BufferedReader(fr);
        String line = null;
        while((line = br.readLine())!=null){
            System.out.println(line);//this is used to read lines from the file but not character by character
        }

//The below code is to read by character which is slow to decreses the time of the access we use Buffered reader and buffer the contains in the given file
//        int c ;//this uses ACSCII
//        while((c=fr.read())!=-1){
//            System.out.print((char) c);
//        }
        br.close();
        fr.close();
    }


}
