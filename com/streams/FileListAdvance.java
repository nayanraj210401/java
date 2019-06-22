package com.streams;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileListAdvance {
    public static void main(String[] args) throws Exception{

//        Files.list(Paths.get("D://"))
//             //   .filter(Files::isRegularFile)
//                .forEach(System.out::println);// this is use read the subfolder in the given directoery as we use noi class which is in the Adavance java class

        Files.walk(Paths.get("D://"))
//             //   .filter(Files::isRegularFile)
             .forEach(System.out::println);
    }

}
