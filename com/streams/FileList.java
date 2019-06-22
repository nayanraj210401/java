package com.streams;

import java.io.File;
//nio is use to read the deep line of the folders such as like subfolders

public class FileList {

    public static void main(String[] args) {
//use to show file in the given folder except the sub folders
        File fileobj = new File("D:\\Downloads");
        String listofFile[] = fileobj.list();
        //for(String file : listofFile){
          //  System.out.println(file);
        }


    }


