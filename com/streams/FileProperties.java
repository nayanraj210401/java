package com.streams;

import java.io.File;

public class FileProperties {

    public static void main(String[] args) throws Exception {

        File fileobj = new File("D:\\myfile.txt");
        System.out.println("FileName="+fileobj.getName());
        System.out.println("File Length:"+fileobj.length());
        System.out.println("file readable:"+fileobj.canRead());
        System.out.println("file write mode:"+fileobj.canWrite());
        System.out.println("Is this file :"+fileobj.isDirectory());
        System.out.println("File found :"+fileobj.exists());


    }


}
