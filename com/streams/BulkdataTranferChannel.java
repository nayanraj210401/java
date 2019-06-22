package com.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BulkdataTranferChannel {


    public static void main(String[] args) throws Exception {

        FileChannel fc =new FileInputStream("D:\\myfile.txt").getChannel();
        FileChannel fcout = new FileOutputStream("D:\\file.txt").getChannel();
        ByteBuffer buffer = ByteBuffer.allocate((int)fc.size());
        fc.read(buffer);
        buffer.position(0);
        fcout.write(buffer);// we can also use fc.tranferTo(0,fc.size(),fcout)
        System.out.println("Created file please check the directory");


    }

}
