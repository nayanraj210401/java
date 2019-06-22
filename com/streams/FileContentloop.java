package com.streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileContentloop {

    public static void main(String[] args) throws Exception {
        FileWriter fw =new FileWriter("D:\\myfile.txt",true);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(fw);
        String text = "";
        System.out.println("Enter Text");
        while(!(text=br.readLine()).equals("exit")){
            bw.newLine();
            bw.write(text);
        }

        bw.close();//close the file
        br.close();
        fw.close();
    }
}
