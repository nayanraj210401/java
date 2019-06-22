package com.streams;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FIleReadLambda {

    public static void main(String[] args) throws Exception {
        Files.lines(Paths.get("D:\\myfile.txt"))
                .forEach(line-> System.out.println(line));//Files -> list -> oulines
        //lines->use to read line by line
        //walk-> used for deep reading like sub folders in an folder
    }
}
